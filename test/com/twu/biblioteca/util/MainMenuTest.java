package com.twu.biblioteca.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainMenuTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private MainMenu menu;

    @Before
    public void setUp() {
        menu = new MainMenu(new String[]{
                "1. List Books"
        });
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testMenuOptions() {
        String[] options = menu.getMenuOptions();

        assertNotNull(options);
        assertEquals(1, options.length);
        assertEquals("1. List Books", options[0]);
    }

    @Test
    public void testMenuShow() {
        menu.show();
        assertEquals("1. List Books", outContent.toString().trim());
    }
}