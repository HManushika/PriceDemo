import {Product} from "./product";

export class Order {
  id: number;
  cartonNumber: number;
  singlesNumber: number;
  product: Product;
  totalNumber: number;
  totalPrice: number;
}
