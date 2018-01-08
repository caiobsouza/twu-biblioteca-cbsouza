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
    public void testlistUsers() {
        User[] users = userAccounts.getUsers();

        assertNotNull(users);
        assertTrue((0 < users.length));

        for (User user : users) {
            assertNotNull(user.getLibraryNumber());
        }
    }

    @Test
    public void testUserExists(){
        final String USER_WHO_EXISTS = "001-1000";
        final String USER_WHO_NOT_EXISTS = "666-6666";

        assertTrue(userAccounts.userExists(USER_WHO_EXISTS));
        assertFalse(userAccounts.userExists(USER_WHO_NOT_EXISTS));
    }

    @Test
    public void testSuccessfulLogin(){
        String libraryNumber = "001-1000";
        String password = "cbsouza";

        boolean hasSuccess = userAccounts.login(libraryNumber, password);
        assertTrue(hasSuccess);
    }

    @Test
    public void testUnauthorizedLogin(){
        String libraryNumber = "001-1000";
        String password = "aaaaaaa";

        boolean hasSuccess = userAccounts.login(libraryNumber, password);
        assertTrue(!hasSuccess);
    }

}
