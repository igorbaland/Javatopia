package com.bal.advanced.streams.intermediate.gettinguniqueelements;

import com.bal.advanced.streams.intermediate.mappingelements.Movie;

import java.util.List;

public class GettingDistinctElementsDemo {
    /*
    Sometimes  we want to get the unique. For example, let's say these likes represents the price of movie. We want to
    print the list of prices we are selling our movies for. We don't want to display 10 twice. That is repetitive.

    movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

                    Output:
                    10
                    20
                    30

     */

    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("c", 20),
                new Movie("d", 30)
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);
    }
}
