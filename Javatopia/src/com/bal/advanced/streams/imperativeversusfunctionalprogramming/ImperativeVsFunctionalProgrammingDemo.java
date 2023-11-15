package com.bal.advanced.streams.imperativeversusfunctionalprogramming;

import java.util.List;

public class ImperativeVsFunctionalProgrammingDemo {
    /*
    Before we talk about streams, let's look at the problem they try to solve.
    Let's say we have a
        > list of movies and we want
            > to count the number of movies
                > that have more than 10 likes

    Programming paradigms
    - declarative
    - functional
    - object-oriented
    - event-driven
    - ...
    In a single application, you might have  multiple paradigms. For example, you might implement certain features using
    the even-driven paradigm. But we might use the functional paradigm  in other parts of our application. This code
    that we have here
            int  count = 0;
                for (var movie : movies)
                if(movie.getLikes() > 10)
                    count++;
    is an example of IMPERATIVE PROGRAMMING. In imperative  programming, we have statements that specify
        > how something should be done. For example, here we have statements that specify
            > how we should count the number of movies that have more than 10 likes.
                1. we initialize the count to 0
                2. we loop our collection of movies
                3. we have if statement
                4. we increment the counter
            These statements determine
                > how something should be done

                        Contrast
            Imperative                Declarative
                How                     What

    For example, SQL is an example of DECLARATIVE language, we write a query to express what we need to get from a
    database
        SELECT *
        FROM movies
        WHERE genre = 1
        ORDER BY name
    But we don't write
        > the actual logic for pulling up data and filtering it

    Streams were introduced in Java, to allow us process a collection of objects in a
        > declarative or more accurately functional way. Functional programming is a special type of declarative
        programming, but it brings some additional concepts.

    Example to rewrite  our imperative programming in functional style
        Every collection in Java has a method called
            > stream
                > this returns a stream of objects.
        What is stream?
        Stream is a sequence of objects, but it's not like a collection
            > it doesn't store data
            > it's just a way to get data out of it
        As a metaphor, think of water tank. The actual water is inside the tank, but we have a bunch of pipes to get the
        water out of the tank. The collection like a water tank. That is where we store some data. A stream like a pipe,
        we can attach one pipe after another. we can build a pipeline to transform data and get it out of a collection.

    stream().filter()
        > parameter of filter predicate
            > take an object and return boolean
                > we can check to see if this object satisfies some criteria. In our list movie, we are looking for
                movie.getLikes() > 10
                    > only movies that satisfy this criteria  will be pulled out of our collection

    stream()
      .filter()
        .count()
        > we can chain methods
        > count > the number of  movies or objects that come out of the stream

    Declarative (Functional) Programming
    Because we have a bunch of functions like filter and count. We are composing these to express a complex logic.In
    this example, we don't have instructions that specify how something should be done. We are purely expressing what
    need to be done. We are saying, we want to filter based on this condition, and we want to count We don't have
    statements like
        > setting the counter to 0
        > increment it
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();


    With streams,
        > we can process a collection of objects
            > in a functional way


     */
    public static void show() {
        List<Movie> movies = List.of(
                                new Movie("a", 10),
                                new Movie("b", 15),
                                new Movie("c", 20)
                            );
        //Imperative Programming
        int  count = 0;
        for (var movie : movies)
            if(movie.getLikes() > 10)
                count++;

        //Declarative (Functional) Programming
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
    }
}
