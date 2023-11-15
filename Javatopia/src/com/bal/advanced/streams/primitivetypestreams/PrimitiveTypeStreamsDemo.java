package com.bal.advanced.streams.primitivetypestreams;

import java.util.stream.IntStream;

public class PrimitiveTypeStreamsDemo {
    /*
    We have learned how to work with streams in Java. Now if you want to work with
        primitive values, it's
            more efficient to use of the specialized types we have
                IntStream
                LongStream
                DoubleStream

    Example
        IntStream
             we have two additional method
                1. range
                2. rangeClosed
                   the upper bound is inclusive

    IntStream.rangeClosed(1, 5)
        first argument
            1 ->  starting value
        second argument
            5 -> ending value

    IntStream.rangeClosed(1, 5)
        .forEach(System.out::print);
    If use the range method
        5 is not included


     */
    public static void  show() {
        IntStream.rangeClosed(1, 5)
                 .forEach(System.out::print);
    }
}
