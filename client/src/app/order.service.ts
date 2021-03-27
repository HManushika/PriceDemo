import { Injectable } from '@angular/core';
import {BehaviorSubject, Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  private baseUrl: string;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8093/order';
  }

  getPriceDetailForEach(id: number, carton: number, singles: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}/${carton}/${singles}`);
  }

  getAllPriceDetails(): Observable<any> {
    return this.http.get(`${this.baseUrl}` + '/list');
  }

}
