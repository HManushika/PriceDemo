package com.sales.demo.service;

import com.sales.demo.dao.ProductRepository;
import com.sales.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProducts() {
        List<Product> pList = productRepository.findAll();
        return pList;
    }

    @Override
    public Product getProductById(Integer productId) {
        Optional<Product> product = productRepository.findById(productId);
        return product.get();
    }


}
