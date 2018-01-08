package com.twu.biblioteca;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.*;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;
import com.twu.biblioteca.util.Menu;

public class BibliotecaApp {

    private BibliotecaCore core;
    private Menu mainMenu;

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
        mainMenu = new MainMenu(core);
        mainMenu.show();
    }

    public void readChoice() {
        ConsoleHelper.requestUserChoice(mainMenu);
    }


}
