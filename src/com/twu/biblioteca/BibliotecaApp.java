package com.twu.biblioteca;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.*;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.Menu;

public class BibliotecaApp {

    private BibliotecaCore core;
    private Menu menu;

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
        menu = new Menu(new MenuOption[]{
                new ListBooksMenuOption("1. List Books", core),
                new ReturnBookMenuOption("2. Return Book", core),
                new QuitMenuOption("3. Quit")
        });

        menu.show();
    }

    public void readChoice() {
        ConsoleHelper.requestUserChoice(menu);
    }


}
