package com.sales.demo.facade;

import com.sales.demo.entity.Order;
import com.sales.demo.entity.Product;
import com.sales.demo.service.OrderService;
import com.sales.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderFacade {

    @Autowired
    ProductService productService;

    @Autowired
    OrderService orderService;

    public List<Order> getPriceDetailForEach(Integer productId, int cartonNumber, int singlesNumber) {
        Product product = productService.getProductById(productId);
        Order order =  orderService.getPriceDetailForEach(product, cartonNumber, singlesNumber);
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        return orders;
    }
    public List<Order> getAllPriceDetails() {
        List<Product> allProducts = productService.getAllProducts();
        return orderService.getAllPriceDetails(allProducts);
    }
}
