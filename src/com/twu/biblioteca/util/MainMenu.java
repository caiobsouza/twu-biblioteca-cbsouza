package com.twu.biblioteca.util;

public class MainMenu {
    private String[] menuOptions;
    private int currentMenuIndex;

    public MainMenu(String[] menuOptions) {
        this.setMenuOptions(menuOptions);
    }

    public void show() {
        for (String option : this.menuOptions) {
            ConsoleHelper.showMessage(option);
        }
    }

    public String[] getMenuOptions() {
        return menuOptions;
    }

    public void setMenuOptions(String[] menuOptions) {
        this.menuOptions = menuOptions;
    }

    public void setCurrentMenuIndex(int currentOptionSelected) {
        this.currentMenuIndex = currentOptionSelected;
    }

    public int getCurrentMenuIndex(){
        return this.currentMenuIndex;
    }

    public String chooseOption(int i) {
        int index = handleZeroIndex(i);
        this.setCurrentMenuIndex(index);

        return this.menuOptions[index];
    }

    private int handleZeroIndex(int i){
        return --i;
    }
}
