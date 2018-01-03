package com.twu.biblioteca.util;

import com.twu.biblioteca.entity.MenuOption;

public class MainMenu {
    private MenuOption[] menuOptions;
    private int currentMenuIndex;

    public MainMenu(MenuOption[] menuOptions) {
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

    public int getCurrentMenuIndex(){
        return this.currentMenuIndex;
    }

    public MenuOption chooseOption(int i) {
        int index = handleZeroIndex(i);
        this.setCurrentMenuIndex(index);

        return this.menuOptions[index];
    }

    private int handleZeroIndex(int i){
        return --i;
    }
}
