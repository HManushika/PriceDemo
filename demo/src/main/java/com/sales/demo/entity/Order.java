package com.sales.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue
    int id;

    @Column
    double totalPrice;
    @Transient
    Integer totalNumber;

    @Transient
    Integer cartonNumber;
    @Transient
    Integer singlesNumber;

    @Transient
    Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCartonNumber() {
        return cartonNumber;
    }

    public void setCartonNumber(Integer cartonNumber) {
        this.cartonNumber = cartonNumber;
    }

    public Integer getSinglesNumber() {
        return singlesNumber;
    }

    public void setSinglesNumber(Integer singlesNumber) {
        this.singlesNumber = singlesNumber;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }
}
