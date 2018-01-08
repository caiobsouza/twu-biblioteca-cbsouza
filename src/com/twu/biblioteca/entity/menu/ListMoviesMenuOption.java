package com.twu.biblioteca.entity.menu;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.Menu;

public class ListMoviesMenuOption extends MenuOption {

    private BibliotecaCore core;

    public ListMoviesMenuOption(String label, BibliotecaCore core){
        super(label);
        this.core = core;
    }

    @Override
    public void action() {
        MenuOption[] options = factoryBookMenuOptions(core.getMovies());
        showSubMenu(options);
    }

    private MenuOption[] factoryBookMenuOptions(Movie[] movies) {

        MenuOption[] options = new MenuOption[movies.length + 1];

        for (int i = 0; i < movies.length && movies[i].getIsAvailable(); i++) {
            options[i] = new MovieItemMenuOption(generateLabel(i, movies[i]), movies[i], core);
        }

        options[movies.length] = new BackMenuOption(String.format("%d. Back", movies.length + 1), core);

        return options;
    }

    private void showSubMenu(MenuOption[] options) {
        Menu menu = new Menu(options);
        menu.show();

        MenuOption option = null;

        while (!(option instanceof QuitMenuOption)) {
            option = ConsoleHelper.requestUserChoice(menu);
        }
    }

    private String generateLabel(int index, Movie movie) {
        String label = String.format("%d. %s\n", (index + 1), movie.getName());
        label += String.format("Author: %s\n", movie.getDirector());
        label += String.format("Year: %d\n", movie.getYear());
        label += String.format("Rating: %d\n- - - - -", movie.getRating());

        return label;
    }
}
