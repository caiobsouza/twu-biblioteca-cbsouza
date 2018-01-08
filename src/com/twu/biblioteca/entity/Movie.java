package com.twu.biblioteca.entity;

public class Movie {

    private String name;
    private String director;
    private int year;
    private int rating;
    private boolean isAvailable;

    protected Movie(String name, int year, String director, int rating) {
        this(name, year, director, rating, true);
    }

    protected Movie(String name, int year, String director, int rating, boolean isAvailable) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public String getDirector() {
        return this.director;
    }

    public int getYear() {
        return this.year;
    }

    public int getRating() {
        return this.rating;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void checkout() {

    }
}
