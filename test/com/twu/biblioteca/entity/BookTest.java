package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BookTest{
    private BibliotecaCore core;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        Book[] mock = new Book[]
                {
                        new Book("Test-Driven Development", "Kent Beck", 2000, true),
                        new Book("Head First Java", "Clark Kent", 2004, true),
                        new Book("Java Hot To Program", "Deitel", 2010, false)
                };

        this.core = new BibliotecaCore(mock);

        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }



        @Test
        public void testBookCheckout() {
            Book book = core.getBooks()[0];

            assertTrue(book.getIsAvailable());
            book.checkOut();
            assertFalse(book.getIsAvailable());
        }

        @Test
        public void testBookCheckoutSuccessMessage() {
            Book availableBook = core.getBooks()[0];
            availableBook.checkOut();
            assertEquals("Thank you! Enjoy the book", outContent.toString().trim());
        }

        @Test
        public void testBookCheckoutUnavailableErrorMessage() {
            Book unavailableBook = core.getBooks()[2];
            unavailableBook.checkOut();
            assertEquals("That book is not available.", outContent.toString().trim());
        }

        @Test
        public void testReturnBook() {
            Book unavailableBook = core.getBooks()[2];
            unavailableBook.checkIn();
            assertEquals("Thank you for returning the book.", outContent.toString().trim());
        }

        @Test
        public void testReturnBookCheckinMessage() {
            Book unavailableBook = core.getBooks()[2];
            unavailableBook.checkIn();
            assertEquals("Thank you for returning the book.", outContent.toString().trim());
        }
}
