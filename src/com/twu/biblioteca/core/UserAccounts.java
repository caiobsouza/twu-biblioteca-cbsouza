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
        User user = findUserByLibraryNumber(libraryNumber);
        return (null != user);
    }

    public User findUserByLibraryNumber(String libraryNumber) {
        User[] usersFound = Arrays.stream(users).filter(user -> user.getLibraryNumber().equals(libraryNumber)).toArray(User[]::new);
        return (null != usersFound && usersFound.length > 0 ? usersFound[0] : null);
    }

    public boolean login(String libraryNumber, String password) {
        if(!userExists(libraryNumber))
            return false;

        User user = findUserByLibraryNumber(libraryNumber);
        return user.checkPassword(password);
    }
}
