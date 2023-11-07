package com.bal.advanced.generics.multipletypeparameters;

public class MultipleTypeParametersDemo {
    /*
    There are times we want to declare multiple type parameters.

    Example
    Let's say we want to implement a method for printing key and a value. Continue in utils class

    Look at the type of these parameters. Initially, the java compiler sees both these parameters as objects, but we can
    pass anything here. We can pass a primitive value, and the Java Compiler will wrap this inside an integer object.
    For the value we can pass a number, we can pass anything.

    We can also declare a class with multiple type parameters continue in KeyValuePair class.

     */

    public static void demo() {
        Utils.print(1, "S");
    }
}
