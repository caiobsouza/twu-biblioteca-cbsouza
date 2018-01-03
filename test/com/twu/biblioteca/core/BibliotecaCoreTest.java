package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BibliotecaCoreTest {

    BibliotecaCore core;

    @Before
    public void setUp() {
        core = new BibliotecaCore(new String[]{"Test-Driven Development", "Head First Java"});
    }

    @Test
    public void testListBooks() {
        String[] books = core.getBooks();

        assertNotNull(books);
        assertEquals(2, books.length);
        assertEquals("Test-Driven Development", books[0]);
        assertEquals("Head First Java", books[1]);
    }

    @Test
    public void testBookDetails() {
        Book[] books = core.getBooks(0);

        assertNotNull(books[0]);
        assertEquals("Test-Driven Development", books[0].getTitle());
        assertEquals("Kent Beck", books[0].getAuthor());
        assertEquals(2000, books[0].getYearPublished());
    }
}
