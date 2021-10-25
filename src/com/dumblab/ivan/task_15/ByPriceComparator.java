package com.dumblab.ivan.task_15;

import com.dumblab.ivan.task_12_14.Book;

import java.util.Comparator;

public class ByPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
