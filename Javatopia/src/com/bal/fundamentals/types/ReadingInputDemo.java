package com.bal.fundamentals.types;

import java.util.Scanner;

public class ReadingInputDemo {
    Scanner scanner = new Scanner(System.in);

    public void demo() {
        System.out.print("Name: ");


        //if we type full name, return firstName then lastName (2 Tokens)
        //solve > scanner.nextLine()
        //with this method we get entire line that the user enters, no matter how many spaces or tabs are there

        // what if we type a few spaces before the name > output with the spaces
        //solve > String.trim()
        String name = scanner.nextLine().trim();
//        byte age = scanner.nextByte();
        //implicit casting/implicit type conversion: byte > String
        System.out.println("You are " + name);
    }

}
