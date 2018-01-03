package com.twu.biblioteca.util;

public class MainMenu {
    private String[] menuOptions;

    public MainMenu(String[] menuOptions){
        this.menuOptions = new String[menuOptions.length];

        for (int i = 0; i < menuOptions.length; i++) {
            this.menuOptions[i] = menuOptions[i];
        }
    }

    public String[] getMenuOptions() {
        return menuOptions;
    }
}
