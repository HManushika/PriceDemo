package com.sales.demo.entity;


import java.util.List;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    int id;

    @Column
    String name;

    @Column
    double cartonPrice;

    @Column
    int numberPerCarton;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCartonPrice() {
        return cartonPrice;
    }

    public void setCartonPrice(double cartonPrice) {
        this.cartonPrice = cartonPrice;
    }

    public int getNumberPerCarton() {
        return numberPerCarton;
    }

    public void setNumberPerCarton(int numberPerCarton) {
        this.numberPerCarton = numberPerCarton;
    }

}
