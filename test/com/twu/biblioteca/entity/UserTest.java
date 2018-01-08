package com.twu.biblioteca.entity;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void testCheckUserPassword(){
        User user = new User("001-0001", "cbsouza");
        assertTrue(user.checkPassword("cbsouza"));
    }
}
