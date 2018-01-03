package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;

public class BibliotecaCore {
    Book[] books;

    public BibliotecaCore(Book[] books){
        this.setBooks(books);
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks(){
        return this.books;
    }
}
