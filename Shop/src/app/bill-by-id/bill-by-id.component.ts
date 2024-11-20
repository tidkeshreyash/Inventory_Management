import { Component, OnInit } from '@angular/core';
import { BillsService } from '../services/bills.service';

@Component({
  selector: 'app-bill-by-id',
  templateUrl: './bill-by-id.component.html',
  styleUrls: ['./bill-by-id.component.css']
})
export class BillByIdComponent implements OnInit {

  constructor(private billService: BillsService) { }

  
  date: String = '';
  billData: any = null;  
  


  ngOnInit(): void {}

  
  // Fetch Inventory Data when barcode changes
  onSubmit() {
    if (this.date) {
      this.billService.getBillByDate(this.date).subscribe(
        (data) => {
          this.billData = data;
        },
        (error) => {
          console.error('Error fetching inventory data:', error);
          this.billData = null;
        }
      );
    }
  }

}
