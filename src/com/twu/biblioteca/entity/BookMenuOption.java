package com.twu.biblioteca.entity;

import com.twu.biblioteca.util.ConsoleHelper;

public class BookMenuOption extends MenuOption {
    private Book book;

    public BookMenuOption(String label, Book book) {
        super(label);
        this.book = book;
    }

    @Override
    public void action() {
        ConsoleHelper.showMessage("ok");
    }
}
