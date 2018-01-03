package com.twu.biblioteca.entity;

import com.twu.biblioteca.util.ConsoleHelper;

public class QuitMenuOption extends MenuOption {

    public QuitMenuOption(String label){
        super(label);
    }

    @Override
    public void action() {
        ConsoleHelper.showMessage("Bye!");
        System.exit(0);
    }
}
