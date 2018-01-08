package com.twu.biblioteca.entity;

public class Movie {

    private int year;
    private String director;
    private String name;
    private int rating;

    public String getName() {
        return this.name;
    }

    public String getDirector() {
        return this.director;
    }

    public int year() {
        return this.year;
    }

    public int getRating() {
        return this.rating;
    }
}
