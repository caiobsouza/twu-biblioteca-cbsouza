package com.twu.biblioteca.util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainMenuTest {
    private MainMenu menu;

    @Before
    public void setUp() {
        menu = new MainMenu(new String[]{
                "1. List Books"
        });
    }

    @Test
    public void testMenuOptions(){
        String[] options = menu.getMenuOptions();

        assertNotNull(options);
        assertEquals(1, options.length);
        assertEquals("1. List Books", options[0]);
    }
}