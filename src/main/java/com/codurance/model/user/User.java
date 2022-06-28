package com.codurance.model.user;

public class User {
    private String firstName;
    private String lastname;
    private String userID;
    private String address;

    public User(String firstName, String lastname, String userID, String address) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.userID = userID;
        this.address = address;
    }
}
