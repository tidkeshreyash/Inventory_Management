import { Component, OnInit } from '@angular/core';
import { InventoryService } from '../services/inventory.service';

@Component({
  selector: 'app-inventory-details',
  templateUrl: './inventory-details.component.html',
  styleUrls: ['./inventory-details.component.css']
})
export class InventoryDetailsComponent implements OnInit {

  inventoryData: any[] = [];
  errorMessage: String= '';

  constructor(private invenService : InventoryService) { }

  ngOnInit(): void {
    this.fetchProducts();
  }

  fetchProducts() {
    this.invenService.getAllSell().subscribe(
      (response) => {
        this.inventoryData = response;
      },
      (error) => {
        console.error('Error fetching products:', error);
        this.errorMessage = 'Error fetching product data.';
      }
    );
  }

}
