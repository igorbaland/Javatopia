package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.runningcodeoncompletion;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CompletionStage;

public class RunningCodeOnCompletionDemo {
    /*
    Quite often we need to execute some code when an asynchronous operation completes. For example, we want to display
    the result or store it in the database.

    future.thenRun()
        This is one of those methods that is provided by the CompletionStage interface

        CompletionStage x;
        x.
        Earlier we told  that this interface represents a stage or a step in an asynchronous operation. Here we have
        a bunch of methods for modeling complex asynchronous operations. A lot of these methods start with "then" that
        means when this task is finished, then do something else. Here we are going to call
            future.thenRun()
            that means, we can run some code was this task has finished.
                future.thenRun(() -> System.out.println("Done"));

    thenRunAsync
    it#s basically saying run or execute this task in asynchronous fashion. The tasks that we pass here, this runnable
    object, is going to be submitted to the underlying executor and execute asynchronously.
        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });
             We can see that this task was executed on this thread
                ForkJoinPool.commonPool-worker-1
                    In contrast if we call future.thenRun()
                        this task is executed on our "main" thread
    That is the difference between thenRun and thenRunAsync

    thenAccept()
    This is useful, if we want to get the result of this CompletableFuture. here we should pass a
        Consumer<T>
            Consumer interface has a single abstract method called
                accept (T t). It takes an object and doesn't return value. here we can pass lambda

                future.thenAccept(result -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(result);
                });
                    main
                    1
                        this task was executed on the main thread. And here is the result of this task

    thenAcceptAsync()
    the similar way to
        thenAccept()
        And this will submit this task to be executed asynchronously. Now this task was executed on the thread, but
        we don't see the result. This happened because our main thread finished earlier than this other thread. if we
        put a delay our in our main thread, we can see the result
            Thread.seep(2000);

    This is how we can execute some code upon completion on asynchronous task

    */
    public static void show() {
        var future =CompletableFuture.supplyAsync(() -> 1);
        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });
    }
}
