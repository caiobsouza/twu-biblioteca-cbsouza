package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Movie;

import java.util.Arrays;

public class BibliotecaCore {
    private Book[] books;
    private Movie[] movies;
    private UserAccounts userAccounts;

    public BibliotecaCore(Book[] books) {
        this(books, null, null);
    }

    public BibliotecaCore(Book[] books, Movie[] movies) {
        this(books, movies, null);
    }

    public BibliotecaCore(Book[] books, Movie[] movies, UserAccounts userAccounts) {
        this.books = books;
        this.movies = movies;
        this.userAccounts = userAccounts;
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
        return Arrays.stream(this.movies).filter(Movie::getIsAvailable).toArray(Movie[]::new);
    }

    public UserAccounts getUserAccounts() {
        return this.userAccounts;
    }
}
