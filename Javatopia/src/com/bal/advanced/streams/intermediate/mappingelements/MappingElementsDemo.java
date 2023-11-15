package com.bal.advanced.streams.intermediate.mappingelements;

import java.util.List;
import java.util.stream.Stream;

public class MappingElementsDemo {
    /*
    Quite often we need to transform the values in a string. To do that, we use
        > the map or
        > flatMap methods.

    Let's say we are only interested of the name of these movies. Instead of having a stream of movie objects, we want
    to have a stream of strings, where these strings are the movie titles.

    Here is how the map method works
            movies.stream()
                .mapToInt(movie -> movie.getLikes())
//                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));


    FlatMap
        flat > Stream<List<x>> -> Stream<x>

        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream.forEach(list -> System.out.println(list));
            [1, 2, 3]
            [4, 5, 6]


        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream
                .flatMap(list -> list.stream())
                .forEach(list -> System.out.print(list));
            123456


    Function
        > takes a movie object
            > return difference values
     */

    public static void show() {
        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream
                .flatMap(list -> list.stream())
                .forEach(list -> System.out.print(list));
    }
}
