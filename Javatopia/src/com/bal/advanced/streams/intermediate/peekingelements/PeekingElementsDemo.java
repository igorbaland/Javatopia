package com.bal.advanced.streams.intermediate.peekingelements;

import com.bal.advanced.streams.intermediate.mappingelements.Movie;

import java.util.List;

public class PeekingElementsDemo {
    /*
    While working with complex queries, we may run to issues, make it the wrong result.


    movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .forEach(System.out::println);
    Let's imagine we expected something different. So one of this operation didn't do his job properly. this is where
    we can use
        > the peek method, to get output of each operation.
    Peek method
        > in an intermedia operation, we can use it to build a processing pipeline.
            Difference between Peek() and forEach()
            The forEach() is a terminal operation and returns void. After we call forEach() method
                > we cannot call another method of the stream class!

            movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(movie -> System.out.println("filtered: " + movie.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);

                Output:
                filtered: b
                mapped: b
                b
                filtered: c
                mapped: c
                c

    With a peek() method, we can observe the output of each operation and this is useful for troubleshooting problems.

     */
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(movie -> System.out.println("filtered: " + movie.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);
    }
}
