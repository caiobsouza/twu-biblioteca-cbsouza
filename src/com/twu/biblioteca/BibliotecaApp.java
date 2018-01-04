package com.twu.biblioteca;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.ListBooksMenuOption;
import com.twu.biblioteca.entity.MenuOption;
import com.twu.biblioteca.entity.QuitMenuOption;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;

public class BibliotecaApp {

    private BibliotecaCore core;
    private MainMenu menu;

    public BibliotecaApp() {
        this.core = new BibliotecaCore(new Book[]
                {
                        new Book("Test-Driven Development", "Kent Beck", 2000, true),
                        new Book("Head First Java", "Clark Kent", 2004, true)
                });
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.welcomeUser();
        app.showMainMenu();
        app.readChoice();
    }

    public void welcomeUser() {
        ConsoleHelper.showMessage("Welcome to Our Library!");
    }

    public void showMainMenu() {
        menu = new MainMenu(new MenuOption[]{
                new ListBooksMenuOption("1. List Books", core),
                new QuitMenuOption("2. Quit")
        });

        menu.show();
    }

    public void readChoice() {
        ConsoleHelper.requestUserChoice(menu);
    }


}
