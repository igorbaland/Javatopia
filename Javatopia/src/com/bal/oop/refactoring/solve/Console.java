package com.bal.oop.refactoring.solve;

import java.util.Scanner;

public class Console {
   /*
   both these methods are static because we only have a single console to work with. In console applications we don't
   have multiple consoles, so it makes sense to use static here.
    */
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
