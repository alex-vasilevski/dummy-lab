package com.dumblab.ivan.task_15;

import com.dumblab.ivan.task_12_14.Book;

import java.util.List;

public class BookComparatorExample {

    public void compareUsingDifferentComparators(List<Book> booksList){

        booksList.sort(new ByNameComparator());
        booksList.forEach(System.out::println);

        booksList.sort(new ByAuthorComparator().thenComparing(new ByNameComparator()));
        booksList.forEach(System.out::println);

        booksList.sort(new ByAuthorComparator().thenComparing(new ByNameComparator()).thenComparing(new ByPriceComparator()));
        booksList.forEach(System.out::println);
    }

}
