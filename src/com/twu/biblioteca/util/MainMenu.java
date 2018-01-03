package com.twu.biblioteca.util;

public class MainMenu {
    private String[] menuOptions;
    private String currentOptionSelected;

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

    public void setCurrentOptionSelected(String currentOptionSelected) {
        this.currentOptionSelected = currentOptionSelected;
    }

    public String getCurrentOptionSelected(){
        return this.currentOptionSelected;
    }

    public String chooseOption(int i) {
        return this.menuOptions[handleZeroIndex(i)];
    }

    private int handleZeroIndex(int i){
        return --i;
    }
}
