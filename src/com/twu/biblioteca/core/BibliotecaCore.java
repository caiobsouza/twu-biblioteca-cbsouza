package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaCore {
    private Book[] books;

    public BibliotecaCore(Book[] books) {
        this.setBooks(books);
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
        return null;
    }
}
