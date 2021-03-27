package com.sales.demo.controller;
import com.sales.demo.entity.Product;
import com.sales.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping(value="/list")
    @ResponseBody
    public List<Product> getAllProducts() {
        return productService.getAllProducts();

    }

}
