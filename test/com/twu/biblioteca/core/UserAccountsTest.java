package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountsTest {

    private UserAccounts userAccounts;

    @Before
    public void setUp() {
        User[] users = {
                new User("001-1000", "cbsouza"),
                new User("002-2000", "idamasce")
        };

        this.userAccounts = new UserAccounts(users);
    }

    @Test
    public void listUsers() {
        User[] users = userAccounts.getUsers();

        assertNotNull(users);
        assertTrue((0 < users.length));

        for (User user : users) {
            assertNotNull(user.getLibraryNumber());
        }
    }

}
