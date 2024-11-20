import { Component, OnInit } from '@angular/core';
import { PurchaseService } from '../services/purchase.service';

@Component({
  selector: 'app-purchase-details',
  templateUrl: './purchase-details.component.html',
  styleUrls: ['./purchase-details.component.css']
})
export class PurchaseDetailsComponent implements OnInit {
  purchaseData: any[] = [];
  errorMessage: String= '';

  constructor(private purchaseService : PurchaseService) { }

  ngOnInit(): void {
    this.fetchProducts();
  }

  fetchProducts() {
    this.purchaseService.getAllPurchase().subscribe(
      (response) => {
        this.purchaseData = response;
      },
      (error) => {
        console.error('Error fetching products:', error);
        this.errorMessage = 'Error fetching product data.';
      }
    );
  }

}
