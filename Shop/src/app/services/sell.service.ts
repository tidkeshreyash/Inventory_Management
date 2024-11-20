import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SellService {

  private url1 = 'http://localhost:8080/getInventory';
  private url2 = 'http://localhost:8080/Store/addSell';
  private url3 = 'http://localhost:8080/Store/getAllSell'

  constructor(private http: HttpClient) {}

  getInventoryByBrandId(brandId: number): Observable<any> {
    return this.http.get<any>(`${this.url1}/${brandId}`);
  } 

  addSell(sellData: any, options: any = {}): Observable<any> {
    return this.http.post<any>(this.url2, sellData, options);
}

getAllSell() {
  return this.http.get<any[]>(this.url3);
}

}
