package com.sales.demo.facade;

import com.sales.demo.entity.Product;
import com.sales.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductFacade {

    @Autowired
    ProductService productService;

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
