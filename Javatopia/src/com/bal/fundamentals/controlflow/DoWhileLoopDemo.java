package com.bal.fundamentals.controlflow;

import java.util.Scanner;

public class DoWhileLoopDemo {
    //execute at least once

    public void show() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        //if condition is false the first time, this loop will never been executed
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next();
            System.out.println(input);
        }

        //execute at least once, because we check the condition last, so do-while loop will always get executed
        do {
            System.out.println("Input: ");
            input = scanner.next();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
