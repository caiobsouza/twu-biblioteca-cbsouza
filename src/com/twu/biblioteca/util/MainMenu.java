package com.twu.biblioteca.util;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.ListBooksMenuOption;
import com.twu.biblioteca.entity.MenuOption;
import com.twu.biblioteca.entity.QuitMenuOption;
import com.twu.biblioteca.entity.ReturnBookMenuOption;

public class MainMenu extends Menu {
    public MainMenu(BibliotecaCore core) {
        super(new MenuOption[]{
                new ListBooksMenuOption("1. List Books", core),
                new ReturnBookMenuOption("2. Return Book", core),
                new QuitMenuOption("3. Quit")
        });
    }
}
