package com.twu.biblioteca.entity.menu;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.MainMenu;

public class MovieItemMenuOption extends MenuOption {

    private Movie movie;
    private BibliotecaCore core;

    public MovieItemMenuOption(String label, Movie movie, BibliotecaCore core) {
        super(label);
        this.movie = movie;
        this.core = core;
    }

    @Override
    public void action() {
        this.movie.checkout();
        ConsoleHelper.showMessage("Enjoy the movie!");

        MainMenu mainMenu = new MainMenu(core);
        mainMenu.show();
        ConsoleHelper.requestUserChoice(mainMenu);
    }
}
