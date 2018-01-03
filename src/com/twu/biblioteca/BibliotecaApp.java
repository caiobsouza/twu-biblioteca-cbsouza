package com.twu.biblioteca;

import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.welcomeUser();
    }

    public void welcomeUser(){
        ConsoleHelper.showMessage("Welcome to Our Library!");
    }

    public void showMenu(){
        MainMenu menu = new MainMenu(new String[]{
                "1. List Books"
        });
    }


}
