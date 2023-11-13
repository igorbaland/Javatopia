package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    /*
    UnaryOperator<T>
    UnaryOperator interface extends Function<T, T>
        > T takes an argument of type T
        > T returns an argument of type T

    How to use this interface
        > show();
     */
    public static void show() {
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }
}
