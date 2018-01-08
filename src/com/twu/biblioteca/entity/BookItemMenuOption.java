package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;

public class BookItemMenuOption extends MenuOption {

    private BibliotecaCore core;
    private Book book;

    public BookItemMenuOption(String label, Book book, BibliotecaCore core) {
        super(label);
        this.book = book;
        this.core = core;
    }

    @Override
    public void action() {
        book.checkOut();

        MainMenu mainMenu = new MainMenu(core);
        mainMenu.show();
        ConsoleHelper.requestUserChoice(mainMenu);
    }

}
