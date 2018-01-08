package com.twu.biblioteca.entity.menu;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.core.UserAccounts;
import com.twu.biblioteca.entity.ProfileInfo;
import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;

public class UserInfoMenuOption extends MenuOption {

    private BibliotecaCore core;
    private UserAccounts accounts;

    public UserInfoMenuOption(String label, BibliotecaCore core) {
        super(label);
        this.accounts = core.getUserAccounts();
        this.core = core;
    }

    @Override
    public void action() {
        User currentUser = accounts.getCurrentUser();
        printProfileInfo(currentUser);
    }

    private void printProfileInfo(User user) {
        ProfileInfo profileInfo = user.getProfileInfo();

        ConsoleHelper.showMessage("- - My Profile - -");
        ConsoleHelper.showMessage(String.format("Name:   %s", profileInfo.getName()));
        ConsoleHelper.showMessage(String.format("E-mail: %s", profileInfo.getEmail()));
        ConsoleHelper.showMessage(String.format("Phone:  %s", profileInfo.getPhone()));
        ConsoleHelper.showMessage("- - - - - - - - -");

        MainMenu mainMenu = new MainMenu(core);
        mainMenu.show();
        ConsoleHelper.requestUserChoice(mainMenu);
    }
}
