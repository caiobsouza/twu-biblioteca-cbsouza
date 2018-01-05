package com.twu.biblioteca.entity;

import com.twu.biblioteca.core.BibliotecaCore;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.Messages;
import com.twu.biblioteca.util.exceptions.InvalidCheckinException;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void checkOut() {
        if (!this.isAvailable) {
            ConsoleHelper.showMessage(Messages.getErrorCheckoutMessage());
        } else {
            this.setIsAvailable(false);
            ConsoleHelper.showMessage(Messages.getSuccessCheckoutMessage());
        }
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void checkIn(BibliotecaCore core) throws InvalidCheckinException {
        setIsAvailable(true);

        if (!core.hasBookInCollection(this)) {
            ConsoleHelper.showMessage(Messages.getErrorCheckinMessage());
            throw new InvalidCheckinException();
        }
        ConsoleHelper.showMessage(Messages.getSuccessCheckinMessage());
    }
}
