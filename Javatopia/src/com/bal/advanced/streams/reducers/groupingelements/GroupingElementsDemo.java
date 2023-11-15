package com.bal.advanced.streams.reducers.groupingelements;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingElementsDemo {
    /*
    Sometimes we need to
        > group or classify our data
    For example, we may need to classify our movies by the genre. We want to know how many action or comedy movies we
    have. We create an enum. This enum is going to have three values
       ENUM CLASS
        COMEDY,
        ACTION,
        THRILLER
            all members in capital, because it is CONSTANT

    We want to classify these movies based on the genre. We use
        the COLLECT() method. In this time, we are going to use a different collector for grouping or classifying our
        movies.
            We use COLLECTORS class
                called the GROUPINGBY()
                    groupingBy is overloaded. The version that we use most of the time is the
                        first version, where we passed a CLASSIFIER. This classifier is a function that takes an object
                        and determines how we are going to classify or group our data.
    In this case, we want to classify our movies
        > based on the genre. We can used a method reference, because we are referencing a method.
            var result = collect(Collectors.groupingBy(Movie::getGenre));
                We get a map of genre to list of movies
                    var result : Map<Genre, List<Movie>>
    Each entry in this map is going to tell us what movies we have for a given a genre

        var result = movies.stream()
                        .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(result);

        {
        THRILLER=[com.bal.advanced.streams.reducers.groupingelements.Movie@7699a589],
        COMEDY=[com.bal.advanced.streams.reducers.groupingelements.Movie@58372a00],
        ACTION=[com.bal.advanced.streams.reducers.groupingelements.Movie@4dd8dc3]
        }

    The second version of type classify or group
        movies.stream()
            .collect(Collectors.groupBy(
                                Movie::getGenre, Collectors.toSet());

        or
        movies.stream()
            .collect(Collectors.groupingBy(
                            Movie::getGenre, Collectors.counting()));

            {COMEDY=1, THRILLER=1, ACTION=1}

        joining() using a coma
            movies.stream()
                .collect(Collectors.groupingBy(
                    Movie::getGenre,
                    Collectors.mapping(
                        Movie:getTitle,
                        Collectors.joining(", "))));

            mapping()
                The collectors only works with
                    a stream of String. But here we are dealing with a stream of movie objects. To fix this problem we
                    use
                    mapping()
                        with this we can map each movie to a string object



     */
    public static void show() {
        var movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 10, Genre.COMEDY)
        );

        var result =movies.stream()
            .collect(Collectors.groupingBy(
                    Movie::getGenre,
                    Collectors.mapping(
                            Movie::getTitle,
                            Collectors.joining(", "))));

        System.out.println(result);

    }
}
