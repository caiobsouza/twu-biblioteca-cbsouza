package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.util.ConsoleHelper;

public class ListBooksMenuOption extends MenuOption {
    private BibliotecaCore core;

    public ListBooksMenuOption(String label, BibliotecaCore core) {
        super(label);
        this.core = core;
    }

    @Override
    public void action() {
        Book[] books = core.getBooks();
        for (Book book : books) {
            ConsoleHelper.showMessage(book.getTitle());
        }
    }
}
