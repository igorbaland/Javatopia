package com.bal.advanced.streams.intermediate.sortingstreams;

import java.util.Comparator;
import java.util.List;

public class SortingStreamsDemo {
    /*
    By default , the elements in a stream come
        > in the same order as the underlying data source.
    But we can change the order using
        > the sort of method

    We are going to change the order of these movies title
            new Movie("b", 10),
            new Movie("a", 20),
            new Movie("c", 30)

    Sorted method
    There are two ways to implement sorting in Java
        1. In the movie class implements COMPARABLE<T> interface.
            We get a compareTo(Object o) method. With this method we can determine how these movies should be sort, they
            will be sorted by the
                > title or
                > likes
            This works for a lot of scenarios, but it has limitations. What if we want to sort the movie by different
            parameter. Let's say, by the
                > number of likes or
                > by the release date
            That is when we use the comparable interface.  If we call the version without any arguments, this will rely
            on the movie class itself to determine the ordering and that means we should implement the comparable
            interface in our movie class.

        2. Sorted method
             In sorted() function we should pass the object that implements the comparable interface.
                There we have
                    > a single abstract method for comparing two objects. So the comparator interface is a
                        > functional interface and we can represent it using a
                            > lambdaExpression

                                >   movies.stream()
                                    .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
            a and b parameters is a movie object. we want to compare by title, title is a string type and a string is
            in java comparable. Above expression is grayed out, because there is a simple way to rewrite this expression
                     movies.stream()
                        .sorted(Comparator.comparing(Movie::getTitle))
                        .forEach(m -> System.out.println(m.getTitle()));
            descending
                        .sorted(Comparator.comparing(Movie::getTitle)).reversed()

     */

    public static void show() {
        var movies = List.of(
                new Movie("b", 10),
                new Movie("a", 20),
                new Movie("c", 30)
        );

        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(m -> System.out.println(m.getTitle()));
    }
}
