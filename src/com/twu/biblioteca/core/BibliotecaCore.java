package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Movie;

import java.util.Arrays;

public class BibliotecaCore {
    private Book[] books;
    private Movie[] movies;

    public BibliotecaCore(Book[] books) {
        this(books, null);
    }

    public BibliotecaCore(Book[] books, Movie[] movies) {
        this.setBooks(books);
        this.setMovies(movies);
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return this.books;
    }

    public Book[] getAvailableBooks() {
        return Arrays.stream(this.books).filter(Book::getIsAvailable).toArray(Book[]::new);
    }

    public boolean hasBookInCollection(Book book) {
        return Arrays.stream(this.books).anyMatch(book::equals);
    }

    public Book findBookByName(String bookName) {
        Book[] books = Arrays.stream(this.books).filter(book -> book.getTitle().equals(bookName)).toArray(Book[]::new);
        return (books == null || books.length <= 0) ? null : books[0];
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public Movie[] getAvailableMovies() {
        return this.movies;
    }
}
