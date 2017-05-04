package com.example.admin.img.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/4/25.
 */

public class ShoppingCart {

    //存放添加的图书
    private List<Book> list = new ArrayList<Book>();

    private DiscountStrategy discountStrategy;    //添加图书

    public void addBook(Book book) {
        list.add(book);
    }

    ;

    //删除图书
    public void removeBook(Book book) {
        list.remove(book);
    }

    ;

    //设置打折策略
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    //结账
    public double checkOut() {
        if (discountStrategy == null) {
            //客户没有设置打折策略，使用默认打折策略
            discountStrategy = new DefaultDiscountStrategy();
        }
        double total = discountStrategy.discount(list);
        return total;
    }
}
