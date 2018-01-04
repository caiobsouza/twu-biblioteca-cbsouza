package com.twu.biblioteca.entity;

import com.twu.biblioteca.util.ConsoleHelper;

public class BookItemMenuOption extends MenuOption {
    private Book book;

    public BookItemMenuOption(String label, Book book) {
        super(label);
        this.book = book;
    }

    @Override
    public void action() {
        book.checkOut();
    }

}
