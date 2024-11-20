import { Component, OnInit } from '@angular/core';
import { SellService } from '../services/sell.service';

@Component({
  selector: 'app-sell-details',
  templateUrl: './sell-details.component.html',
  styleUrls: ['./sell-details.component.css']
})
export class SellDetailsComponent{

  sellData: any[] = [];
  errorMessage: String= '';

  constructor(private sellService : SellService) { }

  ngOnInit(): void {
    this.fetchProducts();
  }

  fetchProducts() {
    this.sellService.getAllSell().subscribe(
      (response) => {
        this.sellData = response;
      },
      (error) => {
        console.error('Error fetching products:', error);
        this.errorMessage = 'Error fetching product data.';
      }
    );
  }


}
