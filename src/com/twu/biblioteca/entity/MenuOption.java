package com.twu.biblioteca.entity;

public class MenuOption {
    private String label;

    public MenuOption(String label){
        this.label = label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public boolean equals(MenuOption option) {
        return (this.label.equals(option.label));
    }
}
