package com.example.admin.img.other;

/**
 * Created by admin on 2017/4/25.
 */

public class Book {

    private String name;    //商品名称

    private double price;   //商品价格

    public Book(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
