package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.consumerinterface;

import java.util.List;
import java.util.function.Consumer;

public class ChainingConsumersDemo {
    /*
    andThen(Consumer<? super t after>)
    With this method we can chain consumers,
        > which basically means we can run many operations in sequence.

    the source code of andThen()
        default Consumer<T> andThen(Consumer<? super T> after) {
            Objects.requireNonNull(after);
            return (T t) -> { accept(t); after.accept(t); };
        }
        Consumer object called after
        Firstly, the ensures that this argument is not null
        return lambda expression
    */
    public static void show() {
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        //we execute 3 operations in sequence
        list.forEach(print.andThen(printUpperCase).andThen(print));
    }
}
