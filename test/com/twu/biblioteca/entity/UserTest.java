package com.twu.biblioteca.entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testCheckUserPassword(){
        User user = new User("001-0001", "cbsouza");
        assertTrue(user.checkPassword("cbsouza"));
    }

    @Test
    public void testGetUserInfo(){
        final String NAME = "Caio";
        final String EMAIL = "cbsouza@thoughtworks.com";
        final String PHONE = "988990011";

        User user = new User("001-1000", "cbsouza", NAME, EMAIL, PHONE);

        assertEquals(NAME, user.getName());
        assertEquals(EMAIL, user.getEmail());
        assertEquals(PHONE, user.getPhone());
    }
}
