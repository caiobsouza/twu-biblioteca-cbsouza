package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;

public class BackMenuOption extends MenuOption {
    private BibliotecaCore core;

    public BackMenuOption(String label, BibliotecaCore core){
        super(label);
        this.core = core;
    }

    @Override
    public void action() {
        MainMenu mainMenu = new MainMenu(core);
        mainMenu.show();

        ConsoleHelper.requestUserChoice(mainMenu);
    }
}
