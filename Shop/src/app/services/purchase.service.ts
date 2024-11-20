import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PurchaseService {
  private apiUrl = 'http://localhost:8080/store/addPurchase'; // Replace with your actual backend URL

  private apiUrl2 = 'http://localhost:8080/store/getAllPurchase'

  constructor(private http: HttpClient) {}

  addPurchase(purchase: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, purchase);
  }


  getAllPurchase() {
    return this.http.get<any[]>(this.apiUrl2);
  }
  
}
