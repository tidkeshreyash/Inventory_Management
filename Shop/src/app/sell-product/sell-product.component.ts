import { Component, OnInit } from '@angular/core';
import { SellService } from '../services/sell.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sell-product',
  templateUrl: './sell-product.component.html',
  styleUrls: ['./sell-product.component.css']
})
export class SellProductComponent{
  barcode: number = 0;  
  inventoryData: any = null;  
  sellQuantity: number = 0;  
  tax: number = 0;  // Tax value
  totalAmount: number = 0;  // Total amount to display
  modeOfPayment: String = '';
  sellDate: string = new Date().toISOString().split('T')[0];
  

  constructor(
    private inventoryService: SellService,
    private sellService: SellService,
    private router: Router
  ) {}

  ngOnInit(): void {}

  
  // Fetch Inventory Data when barcode changes
  onBrandIdChange() {
    if (this.barcode) {
      this.inventoryService.getInventoryByBrandId(this.barcode).subscribe(
        (data) => {
          this.inventoryData = data;
           this.calculateTotalAmount();
        },
        (error) => {
          console.error('Error fetching inventory data:', error);
          this.inventoryData = null;
        }
      );
    }
  }

  calculateTotalAmount() {
    if (this.sellQuantity && this.tax && this.inventoryData) {
      const mrp = this.inventoryData.mrp;
      const taxAmount = this.tax;
      this.totalAmount = (this.sellQuantity * mrp) + taxAmount;
    }
  }

  

  // Handle form submission
  onSubmit() {
    const sellData = {
      brandId: this.barcode,
      brandName: this.inventoryData.brandName,
      quantityInBottles: this.sellQuantity,
      size: this.inventoryData.size,
      unit : this.inventoryData.unit,
      mrp: this.inventoryData.mrp,
      cases: this.inventoryData.cases,
      tax: this.tax,
      totalAmount: this.totalAmount,
      modeOfPayment : this.modeOfPayment,
      sellDate: this.sellDate
    };

    this.sellService.addSell(sellData, { responseType : 'text' as 'json' }).subscribe(
      (response) => {
        console.log('Sale added successfully!', response);
        alert('Sale added successfully and inventory updated!');
        this.router.navigate(['/']); // Navigate to home or inventory page
      },
      (error) => {
        console.error('There was an error!', error);
      }
    );
  }

  
  

}
