import {Component, Input, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, NgForm, Validators} from "@angular/forms";
import {ProductService} from "../../product.service";
import {Product} from "../../product";
import {OrderService} from "../../order.service";
import {Order} from "../../order";
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.scss']
})
export class AddProductComponent implements OnInit {
  _products: Product[];
  order: Order;
  orders: Order[] = [];
  isLoading: boolean;
  @Output() redirect: EventEmitter<any> = new EventEmitter();
  constructor(private productService: ProductService, private orderService: OrderService) {
    this.order = new Order();
  }

  ngOnInit(): void {
    this.reloadData();
  }

  onSubmit() {
    this.getProductTotal(this.order.product.id, this.order.cartonNumber, this.order.singlesNumber);
  }

  pushToOrderArray() {
    this.orders.push(Object.assign({}, this.order));
    this.redirect.emit(this.orders);
  }

  getProductTotal(productId: number, cartonNumber: number, singlesNumber: number) {
    this.isLoading = true;
    this.orderService.getPriceDetailForEach(productId, cartonNumber, singlesNumber).subscribe(data => {
      if (data) {
        this.order.totalPrice = data[0].totalPrice;
        this.isLoading = false;
        this.pushToOrderArray();
      }
    });
  }
  reloadData() {
    this.productService.getAllProducts().subscribe(data => {
      if (data) {
        this._products = data;
      }
    });
  }
}
