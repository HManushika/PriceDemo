import {Component, Input, OnInit} from '@angular/core';
import {Order} from "../../order";

@Component({
  selector: 'app-view-products',
  templateUrl: './view-products.component.html',
  styleUrls: ['./view-products.component.scss']
})
export class ViewProductsComponent implements OnInit {
  @Input() orders: Order[] = [];
  constructor() { }

  ngOnInit(): void {
  }

}
