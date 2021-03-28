import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListProductComponent } from './list-product/list-product.component';
import { HttpClientModule } from '@angular/common/http';
import { CalculatePriceComponent } from './calculate-price/calculate-price.component';
import { AddProductComponent } from './calculate-price/add-product/add-product.component';
import { ViewProductsComponent } from './calculate-price/view-products/view-products.component';
import { FormsModule, ReactiveFormsModule  } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ListProductComponent,
    CalculatePriceComponent,
    AddProductComponent,
    ViewProductsComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
