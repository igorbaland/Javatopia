package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.lambdaexpression;

public class LambdaExpressionDemo {
    /*
    Our greet() method talks to the printer interface. And this is
        > a functional interface because it has
            > a single abstract method

    Wouldn't it be nice if we could implement this method in a
        > standalone function, like a function that exists on its own without belonging to a class. That is what
            > LAMBDA EXPRESSIONS are for. Lambda expression is like an anonymous function that we can pass around.

    First we call a greet method, there we want to pass implementation of the print() method (in our Printer interface)
    as an anonymous function. This method has a single parameter of type string.
        > lambda operator       ->
        > represent the body of this function        {}
            (String message) -> {
                System.out.println(message);
            }
                > this is called a LAMBDA EXPRESSION

    If you have a FUNCTIONAL INTERFACE, we can represent this functional interface using a LAMBDA EXPRESSION. That is
    why these
        > interfaces are called functional, because they represent a
            > function

    As you can see with lambda expression, this code is very clean and concise (knapp), but we can make it
        > better
    1) we can remove the type of this parameter.
        greet((String message) -> {}
            > the Java compiler knows that this parameter  is a string object, because the lambda expression, that we
            passed here,
                () -> {}
            will be checked again the signature of the print() method. The Java compiler knows that this method has a
            single parameter and the type of this parameter is string. We don't have to repeat the type.
    2) If we have a single parameter we can also remove parenthesis
        > message -> {
            that make our code cleaner and more concise
                We use parenthesis
                    > only if we have no parameters or
                        () -> {}
                    > if we have a method with multiple parameters
                        (a, b) -> {}
                            We separate this parameter using a comma. Just like how we declare the parameters of
                            method
    3) If the body of this function has a
        > single line code (like if statement), we don't need these
            > block bracers either
                {}
                    Shortcut for clean up this code
                        alt + enter
                            replace with lambda expression
    This lambda expression looks really good
        > clean
        > concise
            message -> System.out.println(message)
    To compare Lambda expression with an anonymous inner class -> is really ugly.

    Variable
    In greet method we are passing a lambda expression as an argument to a method, but we can also
        > store a lambda expression in a variable
            > of type Printer and set it to a new ConsolePrinter(), this is the
            concrete implementation
                Printer print = new ConsolePrinter()
            > we can set variable to lambda expression
                Printer print = message -> System.out.println(message);

    Lambda expression are
        > essentially objects, but we can use to represent
            > anonymous functions



     */
    public static void show() {
        greet(message -> System.out.println(message));

        Printer print = message -> System.out.println(message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
