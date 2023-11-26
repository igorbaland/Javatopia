package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.combiningcompletablefutures;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class CombiningCompletableFuturesDemo {
    /*
    One of the most powerful features of completableFuture is the ability to start two tasks asynchronously and then
    combine the results. For example, let's say we call remote service to get the price of a product. And that service
    returns the price in US Dollars. At the same time, in parallel, we want to call another service to get the exchange
    rate between US  Dollars and euros. We don't want to call the second service upon completion of the first task. We
    want to start this task concurrently and then wait for both of them to complete in order to calculate the result.

    How to do this?
    //20 USD
    // 0.9
        thenCombine()
            with this we can combine the result of 2 asynchronous operations. we can wait for both of them to complete
            and to calculate the final result. But here is the interesting part. Calling this method is not going to
            block the current thread or basically building a processing pipeline, we are building a recipe. We are
            telling the executed framework: Go ahead and start this two tasks concurrently. When they both complete,
            start a new task to do something else. All of these is happening asynchronously.

            Look at the signature of this method. Here we have two parameters. The first parameter is a CompletionStage
            object, that is our second task. The second parameter is the BiFunction, that is the function with 2
            parameters

            var first = CompletableFuture.supplyAsync(() -> 20);
            var second = CompletableFuture.supplyAsync(() -> 0.9);

            first
                .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(result -> System.out.println(result));

    Example make more interesting
    Let's imagine that the first task returns the price as a string
        CompletableFuture.supplyAsync(() -> "20USD");

    We have a compilation error because we cannot multiply by a number. In our first task, we should transform the
    result.
    */

    public static void show() {

        var first = CompletableFuture
                .supplyAsync(() -> "20USD")
                .thenApply(str -> {
                    var price = str.replace("USD", "");
                    return Integer.parseInt(price);
                });

        var second = CompletableFuture.supplyAsync(() -> 0.9);

        first
                .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(result -> System.out.println(result));
    }
}
