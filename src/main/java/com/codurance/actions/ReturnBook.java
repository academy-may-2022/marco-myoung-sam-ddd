package com.codurance.actions;

import com.codurance.infrastructure.repositories.BookRepository;
import com.codurance.infrastructure.services.SMSSender;
import com.codurance.infrastructure.services.TransactionLogger;
import com.codurance.model.book.Book;
import com.codurance.model.book.BookState;

public class ReturnBook {
    public static void execute(String userID, String ISBN) {
        Book book = BookRepository.get(ISBN);
        book.setState(BookState.AVAILABLE);
        TransactionLogger.add(userID, ISBN, false);
        SMSSender.sendSMS(userID, ISBN, false);
    }
}
