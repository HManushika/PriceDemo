package com.sales.demo.service;

import com.sales.demo.entity.Order;
import com.sales.demo.entity.Product;

import java.util.List;

public interface OrderService {
    Order getPriceDetailForEach(Product product, int cartonNumber, int singlesNumber);
    List<Order> getAllPriceDetails(List<Product> allProducts );
}
