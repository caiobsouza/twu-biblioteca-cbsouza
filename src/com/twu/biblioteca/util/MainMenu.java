package com.twu.biblioteca.util;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.core.UserAccounts;
import com.twu.biblioteca.entity.menu.*;

public class MainMenu extends Menu {
    public MainMenu(BibliotecaCore core) {
        super(new MenuOption[]{
                new ListBooksMenuOption("1. List Books", core),
                new ReturnBookMenuOption("2. Return Book", core),
                new ListMoviesMenuOption("3. List Movies", core),
                new UserInfoMenuOption("4. My Profile", core),
                new QuitMenuOption("5. Quit")
        });
    }
}
