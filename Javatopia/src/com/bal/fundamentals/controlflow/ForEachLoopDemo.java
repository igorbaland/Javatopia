package com.bal.fundamentals.controlflow;

public class ForEachLoopDemo {
    public void demo() {
        String[] fruits = {"Apple", "Mango", "Orange"};

        //if you need the index >> to use for loop
        for (int i = fruits.length; i > 0; i--)
            System.out.println(fruits[i]);

        //in each iteration, fruit will hold the value one item in this array
        //we don't have to declare a numeric: new counter, boolean expression and increment our counter

        //for each loop limitations:
        //>> is always forward only so we cannot iterate over this array from the end to beginning
        //>>we don't have access to the index of each item

        //if you don't need the index >> use for each loop
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
