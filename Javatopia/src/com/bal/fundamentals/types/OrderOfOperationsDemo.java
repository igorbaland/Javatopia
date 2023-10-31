package com.bal.fundamentals.types;

public class OrderOfOperationsDemo {
    public void demo() {
        /*
        Priority
        1.) () -> parenthesis have always the highest priority
        2.) * /
        3.) + -
         */

        // to change the order, we wrap it in parenthesis
        int x = (10 + 3) * 2;
        //like in math, multiplication and division have the higher priority
//        int x = 10 + 3 * 2;
        System.out.println(x);
    }
}
