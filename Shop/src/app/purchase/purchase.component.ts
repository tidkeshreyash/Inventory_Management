import { Component, OnInit } from '@angular/core';
import { PurchaseService } from '../services/purchase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-purchase',
  templateUrl: './purchase.component.html',
  styleUrls: ['./purchase.component.css']
})
export class PurchaseComponent {

  totalAmt : number = 0;

  purchase = {
    brandName: '',
    brandId: null,
    size: null,
    unit: '',
    cases: null,
    bottles: null,
    mrp: null,
    totalAmount: null as number | null,
    purchaseDate: ''
  };

  message: string = '';    
  isSuccess: boolean = false;  

  constructor(private purchaseService: PurchaseService, private router: Router) {}

  calculateTotalAmount() {
    if (this.purchase.bottles && this.purchase.mrp) {
        this.purchase.totalAmount = this.purchase.bottles * this.purchase.mrp;
    }
  }

  onSubmit() {
    if (!this.purchase.brandName || !this.purchase.brandId || !this.purchase.size || !this.purchase.unit|| !this.purchase.bottles||  !this.purchase.purchaseDate) {
      this.message = 'All feilds are required.';
      return;
    }

    this.purchaseService.addPurchase(this.purchase).subscribe(
      (response) => {        
        // this.message = 'Purchase added successfully! Your inventory has been updated.';
        this.isSuccess = true; 
        alert('Sale added successfully and inventory updated!');
        this.router.navigate(['/']); 
        
      },
      (error) => {
        console.error('There was an error!', error);
        
        this.message = 'There was an error submitting the purchase. Please try again.';
        this.isSuccess = false; 
      }
    );
  }
  

}
