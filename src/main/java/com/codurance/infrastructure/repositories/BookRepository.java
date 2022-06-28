package com.codurance.infrastructure.repositories;

import com.codurance.model.book.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private static List<Book> books = new ArrayList<>();

    public static Book get(String ISBN) {
        throw new UnsupportedOperationException();
    }

    public static void add(Book book){
        throw new UnsupportedOperationException();
    }

    public static void remove(Book book){
        throw new UnsupportedOperationException();
    }
}
