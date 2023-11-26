package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.waitingfommanytasks;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WaitingForManyTasksDemo {
    /*
    Sometimes we need to wait for the completion of many tasks before doing something else.

    We are going to create three completableFutures to represent three asynchronous tasks.

    allOf
    the signature of this method
        CompletableFuture ...
            called var R, which means a variable numbers of arguments, we can pass 0 or more arguments.

        var tasksCompletion =CompletableFuture.allOf(first, second, third);

        this will return
            var all = CompletableFuture.allOf(first, second, third);
                new CompletableFuture<Void>
                Why is that void? Because each completableFuture may return a different data type. One return a string,
                another might return an integer... There is no way for us to know what is the final result. That is why
                this is a completable future void
                    will complete with all of completableFutures complete.

        var all =CompletableFuture.allOf(first, second, third);
        all.thenRun(() -> {
            System.out.println("All tasks completed successfully.");
        });

        But what if we want to get the result of each of those completableFuture objects?
            first.get();
                will return the result of the first completableFuture. But in this case, this method is not to going
                to block the current thread. Because this code/this task is not going to get executed asynchronously
                when all this tasks are complete. At this point, when we call it, the get method on any of this
                completable futures will get the result immediately because the result is ready. We get the result of
                the first task and store it
                    var firstResult = first.get();
                        we should wrap get() in try-catch block

     */
    public static void show() {
        var first = CompletableFuture.supplyAsync(() -> 1);
        var second = CompletableFuture.supplyAsync(() -> 2);
        var third = CompletableFuture.supplyAsync(() -> 3);

        var all =CompletableFuture.allOf(first, second, third);
        all.thenRun(() -> {
            try {
                var firstResult = first.get();
                System.out.println(firstResult);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
            System.out.println("All tasks completed successfully.");
        });
    }
}
