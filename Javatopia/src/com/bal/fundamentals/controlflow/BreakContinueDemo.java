package com.bal.fundamentals.controlflow;

import java.util.Scanner;

public class BreakContinueDemo {
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        //if condition is false the first time, this loop will never been executed
        //because we are using condition if (input.equals("quit")), we can set a while-loop condition  to true
//        while (!input.equals("quit")) {
        while (true) {
            System.out.println("Input: ");
            input = scanner.next();
            if (input.equals("pass"))
                //when java sees continue, it will move control to the beginning of the loop
                //all the next statements will be ignored
                // >> System.out.println(input) is not going to get printed on the terminal
                continue;

            //the second way
            if (input.equals("quit"))
                //whe java sees the break statement, it will ignore everything else after and it will terminate the loop
                break;
            System.out.println(input);

            //the first way to solve this problem
//            if (!input.equals("quit"))
//                System.out.println(input);
            //if we type quit, the program terminates, but the word quit also gets echoed back.

        }
    }
}
