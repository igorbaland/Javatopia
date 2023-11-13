package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.functionalinterfaces;

public class FunctionalInterfacesDemo {
    /*
    A functional interface is an interface with only a
        > single abstract method. Earlier we talked about the comparable interface. This interface has a single abstract
        method called compareTo(). This is a functional interface. We also talked about the comparator interface that is
        a functional interface as well.
    We are going to create a functional interface from scratch. We are going use this functional interface throughout
    this section.

    Sometimes we don't want to explicitly create a class to implement an interface because this requires writing a bit
    of code. Sometimes, we may not want to reuse this class.
        > Continue in anonymous inner classes for this purpose
    */
    public static void show() {
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
