package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.Menu;
import com.twu.biblioteca.util.Messages;

public class ListBooksMenuOption extends MenuOption {
    private BibliotecaCore core;

    public ListBooksMenuOption(String label, BibliotecaCore core) {
        super(label);
        this.core = core;
    }

    @Override
    public void action() {
        ConsoleHelper.showMessage(Messages.getBooksHeaderMessage());

        MenuOption[] options = factoryBookMenuOptions(core.getBooks());
        showSubMenu(options);
    }

    private MenuOption[] factoryBookMenuOptions(Book[] books) {

        MenuOption[] options = new MenuOption[books.length + 1];

        for (int i = 0; i < books.length && books[i].getIsAvailable(); i++) {
            options[i] = new BookItemMenuOption(generateLabel(i, books[i]), books[i]);
        }

        options[books.length] = new QuitMenuOption(String.format("%d. Quit", books.length + 1));

        return options;
    }

    private void showSubMenu(MenuOption[] options) {
        Menu menu = new Menu(options);
        menu.show();

        MenuOption option = null;

        while (!(option instanceof QuitMenuOption)) {
            option = ConsoleHelper.requestUserChoice(menu);
        }
    }

    private String generateLabel(int index, Book book) {
        String label = String.format("%d. %s\n", (index + 1), book.getTitle());
        label += String.format("Author: %s\n", book.getAuthor());
        label += String.format("Year: %d\n- - - - -", book.getYearPublished());

        return label;
    }

}
