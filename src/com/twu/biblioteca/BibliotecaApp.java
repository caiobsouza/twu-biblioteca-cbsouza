package com.twu.biblioteca;

import com.twu.biblioteca.util.ConsoleHelper;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.welcomeUser();
    }

    public void welcomeUser(){
        ConsoleHelper.showMessage("Welcome to Our Library!");
    }

    
}
