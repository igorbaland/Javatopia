package com.bal.advanced.exceptions.handling.catching;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CatchingExceptionDemo {
    public static void show() {
        /*
        let's see how we can catch exceptions.
        We have a compilation error, because we haven't handled this FileNotFoundException
            > Unhandled exception: java.io.FileNotFoundException

        To do this, we should wrap this code inside a try block. So we type
        > try followed by curly braces to indicate a block of code
        > then we move these lines inside this try block.
        > after the try block we type the catch clause.
        > in parenthesis, we specify the type of exception we want to catch. In this case FileNotFoundException. Then we
            give it a name. By convention, we call this object ex as a short for exception. So this ex object is an
            instance of FileNotFoundException, is an object that contains information about this exception.
        > after we add another block. In this block, we print a friendly message to the user. Something like file does
            not exist.
        Now let's run this program. Or program didn't crash. This is the proper way to handle checked exceptions. Now,
        we can also get the message from this exception object
        > ex.getMessage : String, so we can print it on the terminal
            > file.txt (Das System kann die angegebene Datei nicht finden)
                        No such file or directory
                > this error message is defined in the FileNotFoundException class.

        What happened to this statement over here
            > System.out.println("File opened");
                > we tried to print file open, but we are not seeing that message. Here is the reason.
                    > When the line throws an exception, the control most to the CATCH FLOW for that exception.
                        var reader = new FileReader("file.txt");
                        The code we have after  the offending line will not be executed. However, if i take this line
                        and put it after our try catch block
                            > it will GET EXECUTED.
        So this is how we can catch exceptions in Java.


        created automatically try catch block with intellij
        > create an instance of FileReader
            var reader = new FileReader("file.txt");
        > put courser on FileReader
        > press alt + enter
        > select surround with try catch
         */

        /*
        this is a proper way to handle checked exceptions.
         */
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            /*
            Look at the stack trace
            This exception was thrown from the FileInputStream class. This is not part of our project. This is part
            of the
            STANDARD JAVA LIBRARY > JAVA.IO package.
            In our show method, let me try to create a new FileReader, the constructor of the FileReader was called and
            then internally, this class works with another class called FileInputStream.
                FileReader > FileInputStream
                at java.base/java.io.FileInputStream.open0(Native Method)
                > this is where the exception was thrown.

            Sometimes you see a long stack trace because of the method calls in the Java Standard library or other
            libraries that you use.
             */
            throw new RuntimeException(e);
        }
//        try {
////            var reader = new FileReader("file.txt");
////            System.out.println("File opened"); //put after try catch block
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
////            System.out.println("File doesn't exist.");
//        }
//            System.out.println("File opened"); // will get executed
    }
}
