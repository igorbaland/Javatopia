package com.bal.advanced.streams.creatingstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    /*
    We have a few different ways to create a stream we can create stream from
        > a collections
        > an arrays
        > an arbitrary number of objects
        > infinite/finite streams

     Collection<Integer> x;
        x.stream().

     var list = new ArrayList<>();
        list.stream().

    int[] numbers = {1, 2, 3};
    Arrays don't have a string method. But we have the
        > arrays class, this is in
            > java.util. package
    int[] numbers = {1, 2, 3};
    Arrays.stream(numbers)

    We can also create a stream from an arbitrary number of objects

    Every stream has method
    > forEach()
        > with this method we can iterate over the stream
            > and get each object
                > parameter IntConsumer
                Consumer represents  > takes an object and doesn't return a value. IntConsumer takes a primitive Integer
                    > primitive specialization of the consumer interface

    Stream method has a static method called
    > of
        Stream.of(1, 2, 3);
            > parameter Object

    generate INFINITE STREAMS, there are actually two ways to do that
        1. Stream.generate(() -> Math.random());
            > parameter Supplier    > supplies or returns of value
                > this will generate
                    > an infinite stream of random numbers. This is not something that we can do with collections,
                    because if we want to store an infinite number of objects in a collection, we are going to run out
                    of memory. What we stream this function is going to get called every time you read a number from the
                    stream. These numbers are not going to get generated ahead of time. This is what we call lazy
                    evaluation. If we create this stream and store in a variable and run our program, nothing happens.
                    No number is generated. We have consumed anything. We don't infinite numbers in the memory. However,
                    if we call
                    var stream = Stream.generate(() -> Math.random());
                    stream.forEach(n -> System.out.println(n));
                        Now this forEach() method is going to continuously request a new number from this stream and
                        then print it. When we run our program we can see an infinite number of random numbers
                        generated.
                    To prevent this we can use
                    > limit() method
                        before calling the forEach() method

                        var stream = Stream.generate(() -> Math.random());
                        stream
                                .limit(3)
                                .forEach(n -> System.out.println(n));

        2. Iterate method
        Stream.iterate()
            > 2 parameters
                > seed
                > unaryOperator oder Predicate
                    > unaryOperator takes a value and returns a new value

            Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));

     */

    public static void show() {
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));
    }
}
