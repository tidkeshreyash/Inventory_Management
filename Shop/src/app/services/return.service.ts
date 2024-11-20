import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ReturnService {

  private url1 = 'http://localhost:8080/Store/returnProduct';
  private url2 = 'http://localhost:8080/Store/getAllReturnProductDetails';
  

  constructor(private http: HttpClient) {}

 

  

  returnProduct(returnData: any, options: any = {}): Observable<any> {
    return this.http.post<any>(this.url1, returnData, options);
}

   getAllReturnDetails(){
    return this.http.get<any[]>(this.url2);
   }
   

  
}
