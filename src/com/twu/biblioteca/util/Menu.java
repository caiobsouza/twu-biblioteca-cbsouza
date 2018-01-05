package com.twu.biblioteca.util;

import com.twu.biblioteca.entity.MenuOption;
import com.twu.biblioteca.util.exceptions.InvalidMenuOptionException;

public class Menu {
    private MenuOption[] menuOptions;
    private int currentMenuIndex;

    public Menu(MenuOption[] menuOptions) {
        this.setMenuOptions(menuOptions);
    }

    public void show() {
        for (MenuOption option : this.menuOptions) {
            ConsoleHelper.showMessage(option.getLabel());
        }
    }

    public MenuOption[] getMenuOptions() {
        return menuOptions;
    }

    public void setMenuOptions(MenuOption[] menuOptions) {
        this.menuOptions = menuOptions;
    }

    public void setCurrentMenuIndex(int currentOptionSelected) {
        this.currentMenuIndex = currentOptionSelected;
    }

    public int getCurrentMenuIndex() {
        return this.currentMenuIndex;
    }

    public MenuOption chooseOption(int i) throws InvalidMenuOptionException {
        int index = handleZeroIndex(i);

        if (isIndexInsideMenuRange(index))
            throw new InvalidMenuOptionException();

        this.setCurrentMenuIndex(index);

        return this.menuOptions[index];
    }

    private int handleZeroIndex(int i) {
        return --i;
    }

    private boolean isIndexInsideMenuRange(int index) {
        return (index < 0 || index >= this.menuOptions.length);
    }
}
