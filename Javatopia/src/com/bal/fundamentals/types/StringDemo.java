package com.bal.fundamentals.types;

public class StringDemo {

    public void show() {
        // package java.lang -> this package is automatically imported because of this doesn't need to import
        //'new String' is redundant
        //a shorter way to initialize string variable
        String  message = "Hello World" + "!!";

        /*
        different between parameters and arguments:
        parameter are the holes that we define in our methods
        arguments are the actual values that we pass to these methods
         */



        /*
            replace -> important here
            replace not modified the original String, it returns a new String
            because in Java a String is immutable, we cannot change/mutate them.
            So any methods that modify a string, will always return a new string object
         */

//        message.replace("!", "*");
//        message.toLowerCase();
//        message.indexOf("H");  //false return -1, true position in this example 0
//        message.length(); //number of characters
//        message.endsWith("!!"); //true or false
//        message.startsWith("!!");
//        message.trim(); //remove white spaces
        System.out.println(message);
    }
}
