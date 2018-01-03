package com.twu.biblioteca.util;

import com.twu.biblioteca.entity.MenuOption;
import com.twu.biblioteca.util.exceptions.InvalidMenuOptionException;

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

    public static void requestUserChoice(MainMenu menu) {
        int choice = ConsoleHelper.getUserInput("Insert an option number: ");
        try {
            MenuOption option = menu.chooseOption(choice);
            option.action();
        } catch (InvalidMenuOptionException ex) {
            requestUserChoice(menu);
        }
    }

}
