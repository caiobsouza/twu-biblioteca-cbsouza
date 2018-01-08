package com.twu.biblioteca.entity;

public class Movie {

    private String name;
    private String director;
    private int year;
    private int rating;



    protected Movie(String name, int year, String director, int rating) {
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
}
