package com.bal.fundamentals.controlflow;

import java.util.Scanner;

public class WhileLoopsDemo {

    public void demo() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        //toLowerCase, exactly equals > "quit"
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            //to pollute memory > always create an object scanner, because of that scanner outside our while
//            Scanner scanner = new Scanner(System.in);
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        //for loop
        //implementation is lighter and cleaner
        //it's better to use > if you know how many times u want to execute one or more statements

        //while loops are better in situations, where we don't know exactly how many times we want to repeat something
        //example > input, until the type quit
//        int i = 0;
//        while (i > 0) {
//            System.out.println("hello world " +i);
//            i--;
//        }
    }
}
