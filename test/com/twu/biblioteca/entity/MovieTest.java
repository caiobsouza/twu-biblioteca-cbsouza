package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private BibliotecaCore core;

    @Before
    public void setUp() {
        Book[] books = new Book[0];
        Movie[] movies = {
                new Movie("Star Wars: The Last Jedi", 2017, "Rian Johnson", 8, true),
                new Movie("Justice League", 2017, "Zack Snyder", 7, true)
        };

        this.core = new BibliotecaCore(books, movies);
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testListMovies() {
        Movie[] movies = core.getMovies();

        assertNotNull(movies);
        assertTrue(0 < movies.length);
    }

    @Test
    public void testMovieHasDetails() {
        Movie[] movies = core.getMovies();

        for (Movie movie : movies) {
            assertNotNull(movie.getName());
            assertNotNull(movie.getDirector());
            assertTrue((0 < movie.getYear()));
            assertTrue((0 < movie.getRating()));
        }
    }

    @Test
    public void testMovieDetailsGetters() {
        Movie movie = core.getMovies()[0];

        assertEquals("Star Wars: The Last Jedi", movie.getName());
        assertEquals("Rian Johnson", movie.getDirector());
        assertEquals(2017, movie.getYear());
        assertEquals(8, movie.getRating());
    }

    @Test
    public void testMovieCheckout(){
        Movie movie = core.getMovies()[0];

        assertTrue(movie.getIsAvailable());
        movie.checkout();
        assertFalse(movie.getIsAvailable());
    }
}
