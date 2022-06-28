package com.codurance.infrastructure.repositories;

import com.codurance.model.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private static List<Transaction> transactions = new ArrayList<>();

    public static void add(Transaction transaction){
        throw new UnsupportedOperationException();
    }
}
