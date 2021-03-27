package com.sales.demo.service;

import com.sales.demo.entity.Product;

public class SampledataTest {
    public static void getProductObj() {
        Product p1 = new Product();
        p1.setId(1);
        p1.setCartonPrice(175);
        p1.setName("Penguine-ear");
        p1.setNumberPerCarton(20);
    }

}
