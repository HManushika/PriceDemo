package com.sales.demo.service;

import com.sales.demo.entity.Order;
import com.sales.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    ProductService productService;

    @Override
    public Order getPriceDetailForEach(Product product, int cartonNumber, int singlesNumber) {
        Order order = new Order();
        double priceForSingles = (singlesNumber > 0) ? calculateTotalPriceForSingles(product, singlesNumber) : 0.0;
        double priceForcartons = (cartonNumber > 0) ? calculateTotalPriceForCartons(product, cartonNumber) : 0.0;
        double totalPrice = priceForSingles + priceForcartons;
        order.setProduct(product);
        order.setCartonNumber(cartonNumber);
        order.setSinglesNumber(singlesNumber);
        order.setTotalPrice(totalPrice);
        return order;
    }

    @Override
    public List<Order> getAllPriceDetails(List<Product> allProducts ) {
        List<Order> allOrderList = new ArrayList<>();
        for (Product product: allProducts) {
            for (int i=1; i<=50; i++) {
                double totalPrice = calculatePriceForEach(product, i);
                Order order = new Order();
                order.setProduct(product);
                order.setTotalNumber(i);
                order.setTotalPrice(totalPrice);
                allOrderList.add(order);
            }
        }
        return allOrderList;
    }
    private Double calculatePriceForEach (Product product, int amount) {
        int numberOfSingles = amount % product.getNumberPerCarton();
        double totalPriceForSingles = (numberOfSingles>0) ? calculateTotalPriceForSingles(product, numberOfSingles) : 0;
        if (product!= null) {
            if (amount >= product.getNumberPerCarton()) {
                int numberOfCartons = amount/ product.getNumberPerCarton();
                double totalPriceForCartons = calculateTotalPriceForCartons(product, numberOfCartons);
                return totalPriceForCartons + totalPriceForSingles;
            }
        }
        return totalPriceForSingles;
    }
    private Double calculateTotalPriceForSingles (Product product, int numberOfSingles) {
        double priceOfSingleProduct = product.getCartonPrice()/product.getNumberPerCarton();
        double priceForSingles = priceOfSingleProduct * numberOfSingles + product.getCartonPrice() * 0.3;
        return priceForSingles;
    }

    private Double calculateTotalPriceForCartons (Product product, int numberOfCartons) {
        double totalPriceForCartons = 0.0;
        if(numberOfCartons <= 3) {
            totalPriceForCartons = numberOfCartons * product.getCartonPrice();
        } else {
            double discount = numberOfCartons * product.getCartonPrice() * 0.1;
            totalPriceForCartons = numberOfCartons * product.getCartonPrice() - discount;
        }
        return totalPriceForCartons;
    }
}
