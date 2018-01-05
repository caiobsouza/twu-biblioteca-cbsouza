package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.util.ConsoleHelper;

public class ReturnBookMenuOption extends MenuOption {
    public ReturnBookMenuOption(String label, BibliotecaCore core){
        super(label);
    }

    @Override
    public void action() {
        ConsoleHelper.getUserStringInput("Insert the name of the book to return: ");
    }


}
