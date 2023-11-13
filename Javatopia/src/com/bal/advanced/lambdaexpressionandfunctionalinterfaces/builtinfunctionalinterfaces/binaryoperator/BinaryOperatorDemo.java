package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.binaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorDemo {
    /*
    Early in this section we talked about this package
        > java.util.function
    This is where we have all these functional interfaces in Java. We told that the list may appear overwhelming, but
    the concept behind this list is actually very simple. All these interfaces fall into four categories
        > consumer
        > supplier
        > function
        > predicate
    All the interfaces you saw our specializations of these four types of functional interface.

    Binary Operator
    In this section, we are going to talk about a special type of function called
        > BINARY OPERATOR
    This addition operator
        > var x = 1 + 2;   is an example of a
            > binary operator, because it has
                > two operands
                > return a single result
        We can represent this concept/this operation using the
            > BinaryOperator<T> interface
            This interface extends the
                > BiFunction<T,T,T> interface
            The BinaryOperator interface is a special type of function. It's a function that takes
                > two arguments of Type T
                > returns result of type T
        Specializations of BinaryOperator
            > primitive specialization. For example,
                > IntBinaryOperator, that takes
                    > two primitive integers
                    > returns an integer

    How to use?
        BinaryOperator<Integer> add = (a, b) -> a + b;
        var result = add.apply(1, 2);
            > if we are dealing with a large number of primitive integers, it's more efficient to use
                > IntBinaryOperator

    Interesting
    Let's say we want to represent this operation, we have two arguments
        > a, b, we want to add them
            > a + b, and then we want to get this
                > square of the result
    To model this, we should have two smalls functions each representing
        > add
        > square
        and then compose them
     */
    public static void show() {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer>  square = a -> a * a;
        var result = add
                            .andThen(square)
                            .apply(1, 2);
    }
}
