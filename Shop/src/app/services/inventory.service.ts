import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class InventoryService {

  private url = 'http://localhost:8080/getAllInventory'

  constructor(private http:HttpClient) { }
  getAllSell() {
    return this.http.get<any[]>(this.url);
  }
}
