package com.bal.advanced.streams.reducers.partitioningelements;

import java.util.List;
import java.util.stream.Collectors;

public class PartitioningElementsDemo {
    /*
    Sometimes we need to partition our data based on some condition. For example, we may need to partition our movies
    into two categories
        1. movies.likes > 20
        2. movies.likes < 20

        We have a collector for this purpose.

    PartitionBy
        here we should pass a
            predicate
                function
                    takes a movie object
                        returns
                            Boolean
    With this condition we partition our movies.
        We get as a result
            Map<Boolean, List<Movies>>
        In this map, we are going to have two entries.
            1. one entry will hold the movies with more than 20 likes
                movies > 20
            2. the other entry hold the other movies
                movies < 20

    We can pass a second collector, which we call a
        downstream stream collector

        var result = movies.stream()
                        .collect(Collectors.partitioningBy(
                            m -> m.getLikes() >20,
                            Collectors.mapping(Movie::getTitle,
                                                Collectors.joining(", ")));

        {false=a,b, true=c}


     */

    public static void show() {
        var movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.COMEDY)
        );

        var result = movies.stream()
                .collect(Collectors.partitioningBy(
                        m -> m.getLikes() > 20,
                        Collectors.mapping(
                                Movie::getTitle, Collectors.joining(","))));

        System.out.println(result);
    }
}
