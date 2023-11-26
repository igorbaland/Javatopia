package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.waitingfommanytasks.waitingforthefirsttaks.handlingtimeouts;

import com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.waitingfommanytasks.waitingforthefirsttaks.LongTask;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class HandlingTimeoutDemo {
    /*
    When calling a remote service, we want to have a limit in terms of how long we are willing to wait to get a response.
    We don't wait forever.
    How to implement this scenario
        we want to simulate a slow connection

        orTimeout()
             with this we can enforce a limit
                we need to pass two arguments
                    1. value of timeUnit()
                    2. timeUnit.SECONDS

            this will return a new CompletableFuture that we timeout after one second.

            If we call the get() method to get result, we are gonna to get an exception. After one second our program
            crashed, we got an exception of type ExecutionException caused by TimeoutException.

            var future = CompletableFuture.supplyAsync(() -> {
                LongTask.simulate();
                return 1;
            });

            try {
                var result = future.orTimeout(1, TimeUnit.SECONDS)
                        .get();
                System.out.println(result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

    This is not an ideal experience for the end user. A better approach is to recover with a default value. Instead of
    calling
        orTimeout()
            we are going to call

                CompleteOnTimeout()
                    here we need to pass 3 values
                        1. value is the default value that we are going to return if this task timeouts.
                            1
                        2. is our timeout value
                            1
                        3. TimeUnit
                This will return a new completableFuture. That will complete after one second.

                After one second we got a default value.
     */
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
            var result = future
                    .completeOnTimeout(1, 1, TimeUnit.SECONDS)
                    .get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
