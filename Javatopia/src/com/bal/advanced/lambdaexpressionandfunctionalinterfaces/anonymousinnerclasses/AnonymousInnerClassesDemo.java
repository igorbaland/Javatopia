package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.anonymousinnerclasses;

public class AnonymousInnerClassesDemo {
    /*
    Sometimes we don't to want to explicitly create a class to implement an interface, perhaps we want to  implement
    an interface only once and use it for a single purpose. We don't want to reuse that class. So that's where we use
        > anonymous inner class, instead of creating a new instance of ConsolePrinter class.
            > we type the name of interface and press enter.
            ANONYMOUS INNER CLASS
            It's anonymous,
                >   because this class doesn't have a name. It's just an implementation and we call it an inner
            class,
                >   because we are using inside method


                public static void show() {
                    greet(new Printer() {
                    @Override
                    public void print(String message) {

                    }
                });

    In this class, we are implemented the print method. We can use a print statement to print this message.

    With anonymous inner class, we  can achieve the same result by writing less code.
        > But java 8 introduced a better and more concise to achieve the same result. that's called
            > a lambda expression

    }
     */
    public static void show() {
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
