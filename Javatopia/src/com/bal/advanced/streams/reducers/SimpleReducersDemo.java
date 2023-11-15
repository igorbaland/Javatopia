package com.bal.advanced.streams.reducers;

import com.bal.advanced.streams.intermediate.mappingelements.Movie;

import java.util.Comparator;
import java.util.List;

public class SimpleReducersDemo {
    /*
    A group of operations called Reducers. They basically
        > reduce a stream of objects
            > to a single object
            For example
                > count, we can use the counter method to count the number of  elements in a stream. The count method
                    reduces a stream to the number of elements in that stream.

                > anyMatch(predicate)
                        movies.stream()
                            .anyMatch(m -> m.getLikes() > 20);      return true, 1xMovie == 30 likes
                > allMatch(predicate)
                            .allMatch(m -> m.getLikes() > 20);   return false
                                if all movies satisfy our condition, 2xMovies don't satisfy this condition
                > noneMatch(predicate)
                            .noneMatch(m -> m.getLikes() > 20);
                                this will tell us if none the  elements of this stream masters condition
                With these matchers we can see if any or all elements in a stream satisfy the condition,

                > findFirst()   Return type Optional<Movie>
                    the first element of this stream
                            var result = movies.stream()
                                .findFirst()
                                .get();
                            System.out.println(result.getTitle());
                > findAny()
                    for getting an element from a stream
                             var result = movies.stream()
                                .findAny()
                                .get();

                > max(comparator)
                            var result = movies.stream()
                                .max(Comparator.comparing(Movie::getLikes))
                                .get();
                            System.out.println(result.getTitle());
                > min(comparator)
                    for selecting the maximum or minimum element based on a comparator

    All these operations are terminal operations, they produce a result.
        > We can not call any other operation after that!

     */
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );
        var result = movies.stream()
                                .max(Comparator.comparing(Movie::getLikes))
                                .get();
        System.out.println(result.getTitle());

    }
}
