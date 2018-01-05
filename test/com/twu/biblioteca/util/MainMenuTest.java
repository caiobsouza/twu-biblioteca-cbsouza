package com.twu.biblioteca.util;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.ListBooksMenuOption;
import com.twu.biblioteca.entity.MenuOption;

import com.twu.biblioteca.util.exceptions.InvalidMenuOptionException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class MainMenuTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Menu menu;

    @Before
    public void setUp() {
        menu = new Menu(new MenuOption[]{
                new ListBooksMenuOption("1. List Books", new BibliotecaCore(new Book[]{
                        new Book("Book Title", "Author", 2000, true)
                }))
        });
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testMenuOptions() {
        MenuOption[] options = menu.getMenuOptions();

        assertNotNull(options);
        assertEquals(1, options.length);
        assertEquals("1. List Books", options[0].getLabel());
    }

    @Test
    public void testMenuShow() {
        menu.show();
        assertEquals("1. List Books", outContent.toString().trim());
    }

    @Test
    public void testChooseOption() {
        try {
            MenuOption menuOption = menu.chooseOption(1);

            assertNotNull(menuOption);
            assertEquals("1. List Books", menuOption.getLabel());
            assertEquals(0, menu.getCurrentMenuIndex());
        } catch (InvalidMenuOptionException ex) {
            fail();
        }
    }

    @Test
    public void testInvalidMenuOption() {
        try {
            MenuOption menuOption = menu.chooseOption(5);
            fail();
        } catch (InvalidMenuOptionException ex) {

        }
    }
}