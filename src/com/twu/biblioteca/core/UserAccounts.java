package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.User;

public class UserAccounts {

    private User[] users;

    public UserAccounts(User[] users){
        this.users = users;
    }

    public User[] getUsers() {
        return this.users;
    }
}
