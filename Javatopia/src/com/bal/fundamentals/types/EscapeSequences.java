package com.bal.fundamentals.types;
/*
 hardly used escape sequences
 */
public class EscapeSequences {
    public void show () {

        //\t -> tab
        String message ="c:\tWindows\\...";

//        String message = "c:\nWindows\\...";
        //output: c:
        //        Windows\...

        // c:\Windows\...
//        String message = "c:\\Windows\\...";
//        String message = "Hello \"Max\"";
//        Output: Hello "Max"
        System.out.println(message);
    }
}
