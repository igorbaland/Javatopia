package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.variablecapture;

public class VariableCaptureDemo {
    /*
    At the  body of our lambda, we are using the message parameter that we have declared there.
        MESSAGE ->
            sout(MESSAGE)
    But we can also access the local variables in the enclosing(abschließende) method.
        public static void show() {
            String prefix = "-";

            greet(message -> System.out.println(prefix + message));
        }

    We can also access the static fields and the enclosing class
        public static String prefix = "-";
        public static void show() {
            greet(message -> System.out.println(prefix + message));
        }

    We can also access the instance fields
        public String prefix = "-";
        public void show() {
            greet(message -> System.out.println(prefix + message));
        }

    Difference between lambda expression and anonymous inner class
    1) What about "this" represents here? it represents the current instance of the VariableCaptureDemo class. If we type
        greet(message -> System.out.println(this + message));
        this.
        we can see the prefix field and show method. This is one of the
            > differences between lambda expressions and anonymous inner classes
               > A lambda expressions,
               this
                    references to enclosing object
               > where is anonymous inner classes,
               this
                    references the current instance of the anonymous inner class
    2)  anonymous inner class
            > can have states. They can have fields
                > to store more some data
        lambda expression
            > cannot have fields. Because this lambda expression is
                > just representing an anonymous function. We can not have instances fields, because we cannot have
                state. we can only access
                    > the local variables declared in the enclosing object, as well as
                        > the static
                        > instance fields
                        in the enclosing class

     */
    public String prefix = "-";
    public void show() {
        greet(message -> System.out.println(message));
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
