package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces;

public class Built_InFunctionalInterfaceDemo {

    /*
    Java provides many predefined functional interfaces that we can use to perform common tasks. These interfaces are
    declare in
        > java.util.function
    As we can see, we have quite a few interfaces here that we can use to perform common tasks. Now the list may appear
    overwhelming, but trust me, this is actually easier than we think. We basically have four types of functional
    interfaces in Java. We have
        > CONSUMER
        > SUPPLIER
        > FUNCTION
        > PREDICATE
    All the interfaces you saw fall into these four categories. First, I want to give you a very brief explanation of
    each of these types. Then we are going to study each of these in detail.

    The consumer interface
    represents an operation that take
        > a single argument and
        > returns no result. That is why it's called consumer because its consume a value. For
        Example, this printer interface that we declare this is very similar to the consumer interface in java. Because
        this print method simply consumes this message. It takes a single argument and doesn't return a value.
            void consume(obj)

    The supplier interface
    is the opposite of the consumer interface. It represents an operation that takes
        > no input and
        > returns a value. It's supplies a value.
            obj suply()

    The function interface
    represents a function that can map a value to a different value.
            obj map(obj)

    The predicate interface
    represents an operation that takes an objet to see if the object satisfies some criteria. We use this in filtering
    data. For example, with product and interface, we can get the consumers who don't have a phone number, or courser
    that are older than two years.
            bool test(condition)
     */

    public static void show() {
        greet(System.out::println);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
