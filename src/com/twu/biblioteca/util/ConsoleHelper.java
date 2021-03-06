package com.twu.biblioteca.util;

import com.twu.biblioteca.entity.menu.MenuOption;
import com.twu.biblioteca.util.exceptions.InvalidMenuOptionException;

import java.util.Scanner;

import static java.lang.System.out;

public class ConsoleHelper {

    public static void showMessage(String s) {
        out.println(s);
    }

    public static int getUserIntInput(String message) {
        out.print(message);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String getUserStringInput(String message) {
        out.print(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static MenuOption requestUserChoice(Menu menu) {
        int choice = ConsoleHelper.getUserIntInput("Insert an option number: ");
        try {
            MenuOption option = menu.chooseOption(choice);
            option.action();
            return option;
        } catch (InvalidMenuOptionException ex) {
            return requestUserChoice(menu);
        }
    }

}
