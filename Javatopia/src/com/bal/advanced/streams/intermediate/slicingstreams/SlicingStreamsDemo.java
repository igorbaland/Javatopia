package com.bal.advanced.streams.intermediate.slicingstreams;

import com.bal.advanced.streams.intermediate.mappingelements.Movie;
import java.util.List;

public class SlicingStreamsDemo {
    /*
    We have four methods for getting a slice of stream
        > limit (n)
            > limit the number of element in a stream
                movies.stream()
                .limit(2)
                .forEach(m -> System.out.print(m.getTitle() + ","));
                    Output: a,b,

        > skip (n)
            > skip a number of elements in a stream. This is useful for pagination
                movies.stream()
                .skip(2)
                .forEach(m -> System.out.print(m.getTitle() + ","));
                    Output: c,

                    Let's say we have
                    > 10_000;
                        > display 10 per page
                            > we are interesting at third page
                                > we should skip 20 movies
                                skip(20) = skip ( (page - 1) x pageSize)
                                limit(10) = limit(pageSize)

                                movies.stream()
                                    .skip(20)
                                    .limit(10)
                                    .forEach(m -> System.out.print(m.getTitle() + ","));


        > takeWhile(predicate)

            > pass a predicate, as long as this condition it's true, keep taking elements
                 movies.stream()
                    .takeWhile(m -> m.getLikes() < 30)
                    .forEach(m -> System.out.print(m.getTitle() + ","));
                        Output: a,b,

                   this takeWhile()  is going the moment we got to the third movie.
                   How it's different from the filter() method? The filter() method iterates the entire data source to
                   find objects that match our criteria. Where is the takeWhile() method stops, the moment this
                   predicate return false. If we change the number of  like this:
                        new Movie("a", 10),
                        new Movie("b", 30),
                        new Movie("c", 20)
                    this stream will only get the first movie. The last movie with 20 likes will not be executed

        > dropWhile(predicate)

            > which is opposite of the takeWhile() method. It's going to escape all the elements that match this
            criteria, and then take the rest. In this case, it's going to skip the first movie because it has less than
            30 likes, but it will take the other 2 movies B and C.
                movies.stream()
                .dropWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.print(m.getTitle() + ","));
                    Output: b,c,


     */

    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 30),
                new Movie("c", 20)
        );

        movies.stream()
                .dropWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.print(m.getTitle() + ","));
    }
}
