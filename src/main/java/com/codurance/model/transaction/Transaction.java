package com.codurance.model.transaction;

public class Transaction {
    private String userID;
    private String ISBN;
    private boolean borrow;

    public Transaction(String userID, String ISBN, boolean borrow) {
        this.userID = userID;
        this.ISBN = ISBN;
        this.borrow = borrow;
    }
}
