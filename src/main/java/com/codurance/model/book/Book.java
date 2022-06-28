package com.codurance.model.book;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private BookState state;

    public Book(String title, String author, String ISBN, BookState state) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.state = state;
    }

    public void setState(BookState state) {
        this.state = state;
    }
}
