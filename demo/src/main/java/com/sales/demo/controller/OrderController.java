package com.sales.demo.controller;

import com.sales.demo.entity.Order;
import com.sales.demo.entity.Product;
import com.sales.demo.facade.OrderFacade;
import com.sales.demo.service.OrderService;
import com.sales.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    OrderFacade orderFacade;


    @GetMapping(value="/{id}/{carton}/{singles}")
    @ResponseBody
    public List<Order> getPriceDetailForEach(@PathVariable(value = "id") Integer productId, @PathVariable(value = "carton") Integer carton, @PathVariable(value = "singles") Integer singles) {
        Order o1 = orderFacade.getPriceDetailForEach(productId, carton, singles);
        List<Order> order = new ArrayList<>();
        order.add(o1);
        return order;
    }

    @GetMapping(value="/list")
    @ResponseBody
    public List<Order> getAllPriceDetails() {
        return orderFacade.getAllPriceDetails();

    }
}