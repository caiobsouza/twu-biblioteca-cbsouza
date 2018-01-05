package com.twu.biblioteca.util;

public class Messages {
    private static final String SUCCESS_CHECKOUT_MESSAGE = "Thank you! Enjoy the book";
    private static final String SUCCESS_CHECKIN_MESSAGE = "Thank you for returning the book.";
    private static final String ERROR_CHECKOUT_MESSAGE = "That book is not available.";
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

    public static String getErrorCheckoutMessage() {
        return ERROR_CHECKOUT_MESSAGE;
    }

    public static String getSuccessCheckinMessage() {
        return SUCCESS_CHECKIN_MESSAGE;
    }
}
