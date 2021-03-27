package com.sales.demo.dao;

import com.sales.demo.entity.Order;
import com.sales.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Integer> {

}
