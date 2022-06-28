package com.codurance.actions;

import com.codurance.infrastructure.repositories.BookRepository;
import com.codurance.infrastructure.services.SMSSender;
import com.codurance.infrastructure.services.TransactionLogger;
import com.codurance.model.book.Book;
import com.codurance.model.book.BookState;

public class BorrowBook {
    public static void execute(String userID, String ISBN) {
        Book book = BookRepository.get(ISBN);
        book.setState(BookState.UNAVAILABLE);
        TransactionLogger.add(userID, ISBN, true);
        SMSSender.sendSMS(userID, ISBN, true);
    }
}
