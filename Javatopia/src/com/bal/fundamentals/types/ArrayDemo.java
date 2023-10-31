package com.bal.fundamentals.types;

import java.util.Arrays;

public class ArrayDemo {

    public void demo() {
        /*
        tha java array have a fixed size. Once we create them, we cannot add or remove additional items to them.
        to be able to add or remove additional items from an array -> one of collection classes.
         */
        //the newer way
        int[] numbers = { 2, 3, 5, 1, 4 };
        Arrays.sort(numbers);
        System.out.println(numbers.length);

        //Array reference type
//        int[] numbers = new int [5];
//        numbers[0] = 1;
//        numbers[1] = 2;

//        System.out.println(Arrays.toString(numbers));
        //the first two are initialized
        //numbers set initial to zero by default
        //boolean to false
        //String to empty string
        //output: [1, 2, 0, 0, 0]

        //ArrayIndexOutOfBoundsException
//        numbers[10] = 3;
    }
}
