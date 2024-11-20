import { Component, OnInit } from '@angular/core';
import { ReturnService } from '../services/return.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-return',
  templateUrl: './return.component.html',
  styleUrls: ['./return.component.css']
})
export class ReturnComponent {
   returnData = {
    brandId: null,
    returnDate: null,
    returnFrom: null,
    size: null,
    unit : null,
    quantityInBottles: null,
    mrp: null,
    totalAmount: null as number | null,
    brandName: null
    
  };

  totalAmt: number=0;

  message: string = '';    
  isSuccess: boolean = false;  

  constructor(private returnService: ReturnService, private router: Router) { }


  
  

  calculateTotalAmount() {
    if (this.returnData.quantityInBottles && this.returnData.mrp) {
      this.totalAmt = this.returnData.quantityInBottles * this.returnData.mrp;
      this.returnData.totalAmount = this.totalAmt;  // Ensure totalAmount is updated
    }
  }

  onSubmit() {
   

    if (
      !this.returnData.brandName ||
      !this.returnData.brandId ||
      !this.returnData.size ||
      !this.returnData.unit ||
      !this.returnData.quantityInBottles ||
      !this.returnData.returnFrom ||
      !this.returnData.returnDate
    ) {
      this.message = 'All fields are required.';
      return;
    }

    this.returnService.returnProduct(this.returnData, { responseType : 'text' as 'json' }).subscribe(
      (response) => {        
        
        this.isSuccess = true; 
        alert('Product Returned Successfully!');
        this.router.navigate(['/']); 
        
      },
      (error) => {
        console.error('There was an error!', error);
        
        this.message = 'There was an error submitting the return. Please try again.';
        this.isSuccess = false; 
      }
    );
  }

}
