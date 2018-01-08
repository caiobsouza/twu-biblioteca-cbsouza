package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.User;

import java.util.Arrays;

public class UserAccounts {

    private User[] users;

    public UserAccounts(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return this.users;
    }

    public boolean userExists(String libraryNumber) {
        User[] result = Arrays.stream(users).filter(user -> user.getLibraryNumber().equals(libraryNumber)).toArray(User[]::new);
        return (null != result && result.length > 0);
    }
}
