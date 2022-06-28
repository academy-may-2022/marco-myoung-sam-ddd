package com.codurance.infrastructure.services;

import com.codurance.infrastructure.repositories.TransactionRepository;
import com.codurance.model.transaction.Transaction;

public class TransactionLogger {
    // true: borrow book
    // false: return book
    public static void add(String userID, String ISBN, boolean borrow) {
        TransactionRepository.add(new Transaction(userID, ISBN, borrow));
    }
}
