package com.example.admin.img.other;

import com.example.admin.img.other.Book;

import java.util.List;

/**
 * Created by admin on 2017/4/25.
 */

public interface DiscountStrategy {
     double discount(List<Book> list);
}
