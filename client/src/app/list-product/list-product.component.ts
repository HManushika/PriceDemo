import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {Product} from '../product';
import {ProductService} from '../product.service';
import {OrderService} from '../order.service';
import {Order} from '../order';

@Component({
  selector: 'app-list-product',
  templateUrl: './list-product.component.html',
  styleUrls: ['./list-product.component.scss']
})
export class ListProductComponent implements OnInit {
  orderList: Order[] = [];
  constructor(private productService: ProductService,  private orderService: OrderService) { }

  ngOnInit(): void {
    this.reloadData();
  }
  reloadData(): void  {
    this.orderService.getAllPriceDetails().subscribe(data => {
      if (data) {
        this.orderList = data;
      }
    });
  }

}
