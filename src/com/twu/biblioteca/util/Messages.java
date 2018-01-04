package com.twu.biblioteca.util;

public class Messages {
    private static final String SUCCESS_CHECKOUT_MESSAGE = "Thank you! Enjoy the book";
    private static final String BOOKS_HEADER_MESSAGE = "* * * * * *\nSelect a book to check-out:";
private static final String QUIT_MESSAGE = "Bye!";

    public static String getSuccessCheckoutMessage() {
        return SUCCESS_CHECKOUT_MESSAGE;
    }

    public static String getQuitMessage() {
        return QUIT_MESSAGE;
    }

    public static String getBooksHeaderMessage() {
        return BOOKS_HEADER_MESSAGE;
    }
}
