import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListProductComponent} from './list-product/list-product.component';
import {CalculatePriceComponent} from './calculate-price/calculate-price.component';

const routes: Routes = [
  { path: '', redirectTo: '', pathMatch: 'full' },
  { path: 'product/list', component: ListProductComponent },
  { path: 'product/calculate', component: CalculatePriceComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
