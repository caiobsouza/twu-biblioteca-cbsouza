package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;

import com.twu.biblioteca.entity.Movie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BibliotecaCoreTest {

    private BibliotecaCore core;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private int booksCount;

    @Before
    public void setUp() {
        Book[] books = new Book[]
                {
                        new Book("Test-Driven Development", "Kent Beck", 2000, true),
                        new Book("Head First Java", "Clark Kent", 2004, true),
                        new Book("Java Hot To Program", "Deitel", 2010, false)
                };

        Movie[] movies = {
                new Movie("Star Wars: The Last Jedi", 2017, "Rian Johnson", 8, true),
                new Movie("Justice League", 2017, "Zack Snyder", 7, true),
                new Movie("Rogue One: A Star Wars Story", 2016, "Gareth Edwards", 8, false)
        };

        this.booksCount = books.length;
        this.core = new BibliotecaCore(books, movies);

        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testListBooks() {
        Book[] books = core.getBooks();

        assertNotNull(books);
        assertEquals(booksCount, books.length);
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

    @Test
    public void testListAvailableBooks() {
        Book[] availableBooks = core.getAvailableBooks();

        for (Book book : availableBooks) {
            if (!book.getIsAvailable())
                fail();
        }
    }

    @Test
    public void testListAvailableMovies(){
        Movie[] availableMovies = core.getAvailableMovies();

        for (Movie movie : availableMovies) {
            if (!movie.getIsAvailable())
                fail();
        }
    }

    @Test
    public void testLibraryContainsBook() {
        Book book = core.getBooks()[0];
        assertTrue(core.hasBookInCollection(book));
    }

    @Test
    public void testFindBookByName() {
        String bookName = "Test-Driven Development";

        Book book = core.findBookByName(bookName);
        assertNotNull(book);
        assertEquals(bookName, book.getTitle());
    }

}
