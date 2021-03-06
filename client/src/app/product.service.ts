import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private baseUrl: string;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8093/product';
  }
  getAllProducts(): Observable<any> {
    return this.http.get(`${this.baseUrl}` + '/list');
  }
}
