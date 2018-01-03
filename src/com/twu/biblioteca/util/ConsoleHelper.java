package com.twu.biblioteca.util;

import java.util.Scanner;

import static java.lang.System.out;

public class ConsoleHelper {

    public static void showMessage(String s) {
        out.println(s);
    }

    public static int getUserInput(String message) {
        out.print(message);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
