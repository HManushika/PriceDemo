package com.sales.demo.facade;

import com.sales.demo.entity.Order;
import com.sales.demo.entity.Product;
import com.sales.demo.service.OrderService;
import com.sales.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderFacade {

    @Autowired
    ProductService productService;

    @Autowired
    OrderService orderService;

    public Order getPriceDetailForEach(Integer productId, int cartonNumber, int singlesNumber) {
        Product product = productService.getProductById(productId);
        return orderService.getPriceDetailForEach(product, cartonNumber, singlesNumber);
    }
    public List<Order> getAllPriceDetails() {
        List<Product> allProducts = productService.getAllProducts();
        return orderService.getAllPriceDetails(allProducts);
    }
}
