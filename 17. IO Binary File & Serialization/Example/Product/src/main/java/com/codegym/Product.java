package com.codegym;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private String production;
    private String describe;

    public Product() {

    }

    public Product(int id, String name, double price, String production, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.production = production;
        this.describe = describe;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduction() {
        return this.production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id = " + id +
                ", name = " + name + '\'' +
                ", price = " + price + '\'' +
                ", production = " + production + '\'' +
                ", describe = " + describe + '\'' +
                '}';
    }
}
