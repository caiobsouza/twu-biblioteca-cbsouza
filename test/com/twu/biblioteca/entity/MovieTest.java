package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MovieTest {

    private BibliotecaCore core;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        Book[] books = new Book[0];
        Movie[] movies = {
                new Movie("Star Wars: The Last Jedi", 2017, "Rian Johnson", 8),
                new Movie("Justice League", 2017, "Zack Snyder", 7)
        };

        this.core = new BibliotecaCore(books, movies);

        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testListMovies() {
        Movie[] movies = core.getMovies();

        assertNotNull(movies);
        assertTrue(movies.length > 0);
    }

    @Test
    public void testMovieHasDetails() {
        Movie[] movies = core.getMovies();

        for (Movie movie : movies) {
            assertNotNull(movie.getName());
            assertNotNull(movie.getDirector());
            assertTrue((movie.year() > 0));
            assertTrue((movie.getRating() > 0));
        }
    }
}
