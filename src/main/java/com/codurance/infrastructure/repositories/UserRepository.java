package com.codurance.infrastructure.repositories;

import com.codurance.model.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<User> users = new ArrayList<>();

    public static void add(User user){
        throw new UnsupportedOperationException();
    }
}
