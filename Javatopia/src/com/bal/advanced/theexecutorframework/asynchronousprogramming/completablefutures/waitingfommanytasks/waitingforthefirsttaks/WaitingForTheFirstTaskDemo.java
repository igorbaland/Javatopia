package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.waitingfommanytasks.waitingforthefirsttaks;

import java.util.concurrent.CompletableFuture;

public class WaitingForTheFirstTaskDemo {
    /*
    Let's say there are two ways to get the current weather in a given city, perhaps we have different two different
    remote service responsible a little  bit slower. We want to call these services concurrently and as soon we get a
    response, we are going to display to the user.

    We are going to call the services concurrently. As soon as of them respond, we are gonna to print the resul on the
    terminal.

    allOff
         wait of completion all tasks

    anyOf
        return a new CompletableFuture
            that will complete as soon one of these completableFuture that we pass here completes.

            This will give us a new completableFuture
                Type
                    CompletableFuture<Object>
        We get the result immediately, we don't wait 5 seconds.
     */

    public static void show() {
        var firstTask = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        var secondTask = CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture
                .anyOf(firstTask, secondTask)
                .thenAccept(temp -> System.out.println(temp));


    }
}
