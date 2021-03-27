package com.sales.demo.service;

import com.sales.demo.dao.ProductRepository;
import com.sales.demo.entity.Product;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {
    @InjectMocks
    private ProductServiceImpl business;

    @Mock
    private ProductRepository repository;

    @Test
    public void getAllProducts_basic() {
        List<Product> productList = new ArrayList<>();
        Product p1 = new Product();
        p1.setId(1);
        p1.setCartonPrice(175);
        p1.setName("Penguine-ear");
        p1.setNumberPerCarton(20);

        Product p2 = new Product();
        p2.setId(2);
        p2.setCartonPrice(825);
        p2.setName("HorseShoe");
        p2.setNumberPerCarton(5);
        productList.add(p1);
        productList.add(p2);

        when(repository.findAll()).thenReturn(productList);
        assertEquals(2, productList.size());

    }


}
