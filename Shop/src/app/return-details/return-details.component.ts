import { Component, OnInit } from '@angular/core';
import { ReturnService } from '../services/return.service';

@Component({
  selector: 'app-return-details',
  templateUrl: './return-details.component.html',
  styleUrls: ['./return-details.component.css']
})
export class ReturnDetailsComponent implements OnInit {

  returnData: any[] = [];
  errorMessage: String= '';

  constructor(private returnService : ReturnService) { }

  ngOnInit(): void {
    this.fetchProducts();
  }

  fetchProducts() {
    this.returnService.getAllReturnDetails().subscribe(
      (response) => {
        this.returnData = response;
      },
      (error) => {
        console.error('Error fetching products:', error);
        this.errorMessage = 'Error fetching product data.';
      }
    );
  }

}
