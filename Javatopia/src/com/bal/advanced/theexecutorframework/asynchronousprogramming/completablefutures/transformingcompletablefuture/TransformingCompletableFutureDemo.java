package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.transformingcompletablefuture;

import java.util.concurrent.CompletableFuture;

public class TransformingCompletableFutureDemo {
    /*
    Sometimes we need to transform the result of an asynchronous task. Fo example, our weather service may return a
    temperature in a complex data structure. But perhaps we are only interested in the temperature as a numeric value.
    We want to map or transform the result into different types.

    Another example, imagine the weather service returns the temperature in celsius, but we want to print it in
    Fahrenheit.

    How to do that?
    var future = CompletableFuture.supplyAsync(() -> 20);
    future.thenApply()
        whenever we see then, that means execute this piece of code after this task or future is complete. With apply()
        method, we can convert or map the result of different type.
        We also have, thenApplyAsync, which will execute this code asynchronously. It was submitted as a new task to the
        underlying execute.

        Here we should pass a function that takes an integer and maps it to a different type. We get a result in celsius
        and we can convert it to Fahrenheit using this formula Celsius, times 1.8 plus 32.
            future.thenApply(celsius -> (celsius * 1.8) + 32);
        Just like the exceptionally() method that we learn about in the last section. this method returns a new
        CompletableFuture. If we call the get method on this CompletableFuture, we will get the result in Fahrenheit.

        try {
            var result = future
                    .thenApply(celsius -> (celsius * 1.8) + 32)
                    .get();
            System.out.println(result);
        }
        catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        We can make it code better. Instead of passing this formula as lambda, we can encapsulate  this inside a method
          THAT IS BETTER
         public static int toFahrenheit(int celsius) {
            return (int) (celsius * 1.8) + 32;
        }

        public static void show() {
            var future = CompletableFuture.supplyAsync(() -> 20);
            try {
                var result = future
                        .thenApply(TransformingCompletableFutureDemo::toFahrenheit)
                        .get();
                System.out.println(result);

    Now, we don't want to call the get() method. Earlier we talked how to run code upon completion of a task. We talked
    about two methods,
        thenRun for executing a task
        thenAccept for executing a task but also passing the result to that task.
    We are going to simplify this code.
    We build a completableFuture
        then we transform it.
            finally we accept or consume the result.

    This is the benefit of completableFutures. with this completableFutures, we can build complex asynchronous operation
    in a declarative way.

     */
    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 20);
        future
            .thenApply(TransformingCompletableFutureDemo::toFahrenheit)
            .thenAccept(f -> System.out.println(f));
    }
}
