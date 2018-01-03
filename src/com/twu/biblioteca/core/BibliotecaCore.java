package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;

public class BibliotecaCore {
    String[] books;

    public BibliotecaCore(String[] books) {
        this.books = new String[books.length];

        for (int i = 0; i < books.length; i++) {
            this.books[i] = books[i];
        }
    }

    public String[] getBooks() {
        return books;
    }

    public Book[] getBooks(int fake){
        return new Book[2];
    }
}
