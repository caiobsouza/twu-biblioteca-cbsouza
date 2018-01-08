package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;
import com.twu.biblioteca.util.Messages;
import com.twu.biblioteca.util.exceptions.InvalidCheckinException;

public class ReturnBookMenuOption extends MenuOption {

    private BibliotecaCore core;

    public ReturnBookMenuOption(String label, BibliotecaCore core) {
        super(label);
        this.core = core;
    }

    @Override
    public void action() {
        String queryString = ConsoleHelper.getUserStringInput("Insert the name of the book to return: ");
        Book book = core.findBookByName(queryString);

        if (null == book) {
            ConsoleHelper.showMessage(Messages.getErrorCheckinMessage());
            action();
            return;
        }
        try {
            book.checkIn(core);
            MainMenu mainMenu = new MainMenu(core);
            mainMenu.show();
            ConsoleHelper.requestUserChoice(mainMenu);
        } catch (InvalidCheckinException ex) {
            ConsoleHelper.showMessage(Messages.getErrorCheckinMessage());
            action();
        }
    }


}
