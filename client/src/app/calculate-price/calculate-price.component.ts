import { Component, OnInit } from '@angular/core';
import {Order} from "../order";

@Component({
  selector: 'app-calculate-price',
  templateUrl: './calculate-price.component.html',
  styleUrls: ['./calculate-price.component.scss']
})
export class CalculatePriceComponent implements OnInit {
  pOrders: Order[] = [];
  total: number = 0;

  constructor() { }

  ngOnInit(): void {
  }

  calculateTotal () {
    this.total = this.pOrders.reduce(function(result,item) {
      return result + item.totalPrice;
    }, 0);
    return this.total;
  }

}
