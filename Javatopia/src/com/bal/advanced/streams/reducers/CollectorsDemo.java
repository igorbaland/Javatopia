package com.bal.advanced.streams.reducers;

import com.bal.advanced.streams.intermediate.mappingelements.Movie;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {
    /*
    We  have been consuming these streams is in the
        > forEach() method. But quite often we want to collect the result of a stream into a data structure, like a
            > list, set, map and so on.

    Collect()
        > this method is overloaded
            > we use most often the second version, that takes collector object.
                > This collector is an interface. It has several different implementations. We have collectors for
                    > converting a stream into a list, set, map and so on.
    To create one of these collectors, we use the
        > Collectors class. This class has a bunch of
            > static factory methods for creating collector object. For example, we can
                > toList() and this will return an instance of the collector interface
                    > that knows how to convert a stream into a list.
    toList()
                    //type List<Movies>
                    var result = movies.stream()
                        .filter(m -> m.getLikes() > 10)
                        .collect(Collectors.toList());

    toSet()
                 .collect(Collectors.toSet());

    toMap()
        convert into HashMap
            key (title)
            value (likes)

            .collect(Collectors.toMap(m -> m.getTitle(), movie -> movie.getLikes()));
                call method without attributes
                    > reference method (better)
                        collect(Movie::getTitle, Movie::getLikes)

                        {b=20, c=30}

    Storing the actual movie object as the value
        We need to pass a lambda
            that takes a movie object
                returns that movie object

            var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, m -> m));
            System.out.println(result);

            {b=com.bal.advanced.streams.intermediate.mappingelements.Movie@404b9385,
            c=com.bal.advanced.streams.intermediate.mappingelements.Movie@6d311334}

            //better way to write this code
            .collect(Collectors.toMap(Movie::getTitle, Function.identity()));

    Collector.summingInt or overage of values
            var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes));
            System.out.println(result);

            Output: 50

    Collector.summingDouble()
        > return result a double
            .collect(Collectors.summingDouble(Movie::getLikes());

    My favourite collector
        > summarizingInt
            collect(Collectors.summarizingInt(Movie:getLikes));

            Output:
            IntSummaryStatistics{count=2, sum=50, min=20, average=25,000000, max=30}

            This give us statistic about the values in our stream.
                1. After the filter operation, we are going to have two movies that match this criteria
                    there two movies that have more than likes, s count is 2
                        IntSummaryStatistics{
                            count=2,
                2. The sum of these values is 50
                        IntSummaryStatistics{count=2,
                            sum=50
                3. min is 20
                        IntSummaryStatistics{count=2, sum=50,
                            min=20
                4. 25
                5. 30

        This is very useful in building real applications.

        > summarizingLong
        > summarizingDouble
            they do the exact same job return the values as a longs or doubles

    Collectors.joining()
        > set delimiter to or Array/Collection

                var result = movies.stream()
                    .filter(m -> m.getLikes() > 10)
                    .map(Movie::getTitles)
                    .collect(Collectors.joining(",");
                System.out.println(result);


     */
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
