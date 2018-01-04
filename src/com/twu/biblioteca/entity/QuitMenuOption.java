package com.twu.biblioteca.entity;

import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.Messages;

public class QuitMenuOption extends MenuOption {

    public QuitMenuOption(String label){
        super(label);
    }

    @Override
    public void action() {
        ConsoleHelper.showMessage(Messages.getQuitMessage());
        System.exit(0);
    }
}
