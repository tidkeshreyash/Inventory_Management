import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BillsService {
  private url1 = 'http://localhost:8080/Store/bills/by-date';

  constructor(private http: HttpClient) { }
  getBillByDate(date: String): Observable<any> {
    return this.http.get<any>(`${this.url1}/${date}`);
  } 
}
