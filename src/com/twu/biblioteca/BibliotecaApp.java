package com.twu.biblioteca;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.core.UserAccounts;
import com.twu.biblioteca.entity.*;
import com.twu.biblioteca.util.*;

public class BibliotecaApp {

    private BibliotecaCore core;
    private Menu mainMenu;

    public BibliotecaApp() {

        Movie[] movies = {
                new Movie("Star Wars: The Last Jedi", 2017, "Rian Johnson", 8, true),
                new Movie("Justice League", 2017, "Zack Snyder", 7, true)
        };

        Book[] books = {
                new Book("Test-Driven Development", "Kent Beck", 2000, true),
                new Book("Head First Java", "Clark Kent", 2004, true)
        };

        User[] users = {
                new User("001-1000", "cbsouza", new ProfileInfo("Caio", "cbsouza@thoughtworks.com","988880000")),
                new User("002-2000", "idamasce", new ProfileInfo("Isabelly","idamasce@thoughtworks.com", "977771111"))
        };

        this.core = new BibliotecaCore(books, movies, new UserAccounts(users));
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.signIn();
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

    public void signIn(){
        String libraryNumber = ConsoleHelper.getUserStringInput("Library Number: ");
        String password = ConsoleHelper.getUserStringInput("Password: ");

        if(!core.getUserAccounts().login(libraryNumber, password)) {
            ConsoleHelper.showMessage("Username or password incorrect");
            signIn();
        }
    }


}
