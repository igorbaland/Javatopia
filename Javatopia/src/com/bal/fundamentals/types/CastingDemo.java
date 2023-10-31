package com.bal.fundamentals.types;

public class CastingDemo {
    public void demo() {

        /*
            explicitly cast
         */
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);

        //wrapper classes
        //Integer > int
        //Short -> short
        //...

//---------------
/*
        implicit casting
        -> automatic conversion/casting. We don't have to worry about this

 */
        //byte > short > int > long > float > double

//        double x = 1.1;
//        double y = x + 2; //2.0 > java is going to automatically cast this integer to a double
//        System.out.println(y);

//        short x = 1;
//        // two different type of values (short/int)
//        // short = 2 bytes
//        // int = 4 bytes
//        // any values that we store in a short variable, can also be stores in an integer variable
//        int y = x + 2;
//        System.out.println(y);
    }
}
