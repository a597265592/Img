package com.example.admin.img.other;

import java.util.List;

/**
 * Created by admin on 2017/4/25.
 */

public class FirstDiscountStrategy implements DiscountStrategy{

    @Override
    public double discount(List<Book> list) {
        double total = 0;
        for(Book book : list){
            if("红楼梦".equals(book.getName())){
                total = total+book.getPrice()*0.8;
            }else{
                total = total+book.getPrice();
            }
        }
        return total;
    }
}