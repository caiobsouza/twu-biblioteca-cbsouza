package com.twu.biblioteca;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.MenuOption;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;

public class BibliotecaApp {

    private BibliotecaCore core;

    public BibliotecaApp() {
        this.core = new BibliotecaCore(new Book[]
                {
                        new Book("Test-Driven Development", "Kent Beck", 2000),
                        new Book("Head First Java", "Clark Kent", 2004)
                });
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.welcomeUser();
        app.showMenu();
    }

    public void welcomeUser() {
        ConsoleHelper.showMessage("Welcome to Our Library!");
    }

    public void showMenu() {
        MainMenu menu = new MainMenu(new MenuOption[]{
                new MenuOption("1. List Books")
        });

        menu.show();

    }


}
