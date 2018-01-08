package com.twu.biblioteca.util;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.menu.ListBooksMenuOption;
import com.twu.biblioteca.entity.menu.MenuOption;
import com.twu.biblioteca.entity.menu.QuitMenuOption;
import com.twu.biblioteca.entity.menu.ReturnBookMenuOption;

public class MainMenu extends Menu {
    public MainMenu(BibliotecaCore core) {
        super(new MenuOption[]{
                new ListBooksMenuOption("1. List Books", core),
                new ReturnBookMenuOption("2. Return Book", core),
                new QuitMenuOption("3. Quit")
        });
    }
}
