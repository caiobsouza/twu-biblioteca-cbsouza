package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BibliotecaCoreTest {

    private BibliotecaCore core;

    @Before
    public void setUp() {
        core = new BibliotecaCore(new Book[]
                {
                        new Book("Test-Driven Development", "Kent Beck", 2000),
                        new Book("Head First Java", "Clark Kent", 2004)
                });
    }

    @Test
    public void testListBooks() {
        Book[] books = core.getBooks();

        assertNotNull(books);
        assertEquals(2, books.length);
        assertEquals("Test-Driven Development", books[0].getTitle());
        assertEquals("Head First Java", books[1].getTitle());
    }

    @Test
    public void testBookDetails() {
        Book[] books = core.getBooks();

        assertNotNull(books[0]);
        assertEquals("Test-Driven Development", books[0].getTitle());
        assertEquals("Kent Beck", books[0].getAuthor());
        assertEquals(2000, books[0].getYearPublished());
    }
}
