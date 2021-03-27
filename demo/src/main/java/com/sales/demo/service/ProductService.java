package com.sales.demo.service;

import com.sales.demo.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts ();

    Product getProductById(Integer productId);
}
