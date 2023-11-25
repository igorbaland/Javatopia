package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.creatingcompleteablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CreatingCompletableFutureDemo {
    /*
    CompletableFuture class has a couple of methods that we use for creating completableFuture object. If we want to run
    a task that doesn't return a value, we call
        runAsync();
            This basically says run this task in an asynchronous or non-blocking fashion. Here we can pass a
            Runnable object or
            a runnable + executor
                If we don't pass an execute, this method is going to run our task on a common pool

    ForkJoinPool
        One of implementation of the executor serviceInterface
            commonPool()
                returns the pool that is used by the completable future class. If we don't supply a pool, this is the
                pool that is going to be used under the hood.
        This pool is well aware of the number of available threads.  How to get that?
            We have a class Runtime.getRuntime().availableProcessors()
                On my machine I have four cores and each core have threads
                    var availableProcessors =Runtime.getRuntime().availableProcessors();
                    System.out.println(availableProcessors);
                        8
        The common pool is based on the number of available threads. Now, if this doesn't it your application, we can
        always create a custom pool with fewer or more threads.

    To simplify this, I'm not gonna pass a pool, we are just to pass a runnable object. Let us create a runnable
    interface object. Let's create a runnable object call task
            Runnable task = () -> System.out.println("a");
            var future = CompletableFuture.runAsync(task);
                This returns is completable future of void. With this single line of code, we can execute the task in
                asynchronous fashion.
                    We didn't have to create an executor and
                        then submit a task to it and
                            then shut it down
    We only call completable future that runAsync().

    supplyAsync()
    At the time if we want to return a value, instead of calling the runAsync() method, we call the
        supplyAsync()
            look at the signature of this method, here we can pass a supplier. That is a functional interface.
                get() : T, that returns a value. Similar to the runAsync(). Here we can pass
                    supplier
                    supplier + executor
                If we don't supplier an executor, the common pool will be used
    We change this task to a supplier of integer.
        Supplier<Integer> task = () -> 1;
            var future = CompletableFuture.supplyAsync(task);
            This will return a CompletableFuture<Integer>
    If we wanna to get this value, we call
        future.get()
            Because this is the future object. All the methods that we learn about the future objects, also exist here.
            As we told before, this get() method is a blocking method. It's going to block the current thread until the
            result is ready. But in this completableFuture object, we have a bunch of other methods that allow us to
            build complex asynchronous operations. We will talk about it through this section.
    Let's call the get() method  and store in result variable. We should wrap this with a try-catch block, and then
    print the result.
        try {
            var result = future.get();
            System.out.println(result);
        }
        catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    This is how we can create a CompletableFuture object.

     */
    public static void show () {
        Supplier<Integer> task = () -> 1;
        var future = CompletableFuture.supplyAsync(task);
        try {
            var result = future.get();
            System.out.println(result);
        }
        catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
