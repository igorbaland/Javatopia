package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.functionalinterface;

import java.util.function.Function;

public class FunctionalInterfaceDemo {
    /*
    As the name implies, this interface represents a function or an operation that takes an argument and return a value.
    We have two generic type parameters,
        <T, R>
        T > type of the input to the function
        R > the type of the result of the function

            Bifunction<T,U,R>
            U > the type of the second argument

            We also have primitive specialization. this specialization fall into three categories
                1. arguments have a specific type, but the return value is parameterized. For example
                    IntFunction<R> represents a function that takes a primitive integer.
                        R apply(int value)
                    LongFunction<R>
                    DoubleFunction<R>
                2. the argument is parameterized For example,
                    ToIntFunction <T> represents a function that returns a primitive integer.
                        int applyAsInt(T value)
                            the argument is parameterized and the return value is
                    ToLongFunction <T>
                    ToDoubleFunction <T>
                3. Both arguments are specialized. For example,
                    IntoLongFunction represents a function that takes a primitive integer and returns primitive long
                        long applyAsLong(int value)
     */
    public static void show() {
        Function<String, Integer>  map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);
    }
}
