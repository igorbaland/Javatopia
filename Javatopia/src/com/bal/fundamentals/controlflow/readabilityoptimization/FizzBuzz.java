package com.bal.fundamentals.controlflow.readabilityoptimization;

import java.util.Scanner;

public class FizzBuzz {
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        byte number = scanner.nextByte();

        //prefer this solution, even though we had a bit of repetition in the code
        //the more you program, the more you build software, the more you realize that
        // >> there is no way to build IDEAL SOFTWARE
        // >> a bit of repetition but it had a flat structure
        // >> no nesting here
        // >> this code is cleaner and easier to read
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        //the second way without redundant statements
        //the more we nest these if else statements > more confusing your code is going  to be to other people
        //hard to read and understand
        if (number % 5 == 0)
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
