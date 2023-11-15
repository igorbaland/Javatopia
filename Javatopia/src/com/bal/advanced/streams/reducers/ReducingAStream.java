package com.bal.advanced.streams.reducers;

import com.bal.advanced.streams.intermediate.mappingelements.Movie;

import java.util.List;
import java.util.Optional;

public class ReducingAStream {
    /*
    We also have a general purpose reduction operation that give us more control over reducing a stream to a single
    value. For example, let's say we want to add up all the likes of these movies.

    Reduce()
        overload method BinaryOperator<Integer>
    We start of by getting a stream.
        > Then we call the map method to map each movie with number of likes.
            > Now we have a stream of integers, where we call the REDUCE() method
                > to reduce the stream to a single value.
                    > This method is overloaded. The version we use most often is
                        > BinaryOperator<Integer> accumulator
                            > takes two values return a single value
    In this case, the binary operator is called
        > an accumulator. And the job of this operator is
            > to accumulate values.
                .reduce((a, b) -> a + b);
                    How its works?
                        this accumulator is going to be applied
                            > on the first two elements in this stream
                            [10, 20, 30], it will add them up and the result will be 30
                             ^   ^
                                [30, 30], than the accumulator is going to be applied on these
                                 ^   ^
                                [60] The result will be 60. The job of this accumulator is to accumulate the values

    Return type of REDUCE an OPTIONAL of integer. Very briefly
        > an OPTIONAL class represents an object that
            > may or may not have a value.
                the value is optional. We will be talking about Optional in detail in the future.
    The reason this method returns an optional of integer as opposed to an integer is that sometimes we would have an
    empty stream.
        Optional<Integer> sum = movies.stream()
                                        .map(m -> m.getLikes())
                                        .reduce((a, b) -> a + b);

    If we have a value, we can get it using
        > the get method
    If we don't have a value, this will
        > throw an exception. To prevent that from happening, we can supply it
            > default value. Instead of calling a get() method
                > we call orElse(), and this is where we supply a default value.
                    If we have an empty stream,
                    we can say the result of adding all these values will be zero

                        sum.orElse(0)


    Method reference REDUCE
        reduce(Integer::sum);

    Reduce()
        > overload method Integer identity
            This like  an initial value that we can supply. If we supply this value, then we don't have to  worry about
                working with an optional.

                With optional:
                Optional<Integer> sum = movies.stream()
                                        .map(Movie::getLikes)
                                        .reduce(Integer::sum);
                System.out.println(sum.orElse(0));

                Without optional (with Integer identity):
                Integer sum = movies.stream()
                    .map(Movie::getLikes)
                    .reduce(0, Integer::sum);
                System.out.println(sum);

    Using the reduce method we can perform general purpose reduction

     */

    public static void demo() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        Integer sum = movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
