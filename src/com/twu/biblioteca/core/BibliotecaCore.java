package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;

public class BibliotecaCore {
    Book[] books;

    public BibliotecaCore(Book[] books){
        this.books = new Book[books.length];

        for (int i = 0; i < books.length; i++) {
            this.books[i] = books[i];
        }
    }

    public Book[] getBooks(){
        return this.books;
    }
}
