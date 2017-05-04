package com.example.admin.img.other;

import java.util.List;

/**
 * Created by admin on 2017/4/25.
 */

public class DefaultDiscountStrategy implements DiscountStrategy{

    @Override
    public double discount(List<Book> list) {
        double total = 0;
        for(Book book : list){
            total = total+book.getPrice();
        }
        return total;
    }

}
