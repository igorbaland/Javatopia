package com.bal.advanced.streams.intermediate.filteringelements;

import com.bal.advanced.streams.intermediate.mappingelements.Movie;

import java.util.List;
import java.util.function.Predicate;

public class FilteringElementsDemo {
    /*
    We have a list of movies just like before, we want to filter this list, and only get the movies that have more than
    10 likes

    The stream methods fall into 2 categories
                Intermediate                Terminal
                map()                       forEach()
                filter()

     */
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(m -> System.out.println(m.getTitle()));

    }
}
