package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BibliotecaAppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    BibliotecaApp app;

    @Before
    public void setUp(){
        app = new BibliotecaApp();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown(){
        System.setOut(null);
    }

    @Test
    public void testWelcomeUser(){
        app.welcomeUser();
        assertEquals("Welcome to Our Library!", outContent.toString());
    }
}
