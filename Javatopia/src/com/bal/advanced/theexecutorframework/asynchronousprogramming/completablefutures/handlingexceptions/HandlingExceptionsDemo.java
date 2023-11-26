package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.handlingexceptions;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HandlingExceptionsDemo {
    /*
    We have learn how to consume the result of an asynchronous task. But what if this task throws an exception?
    For example, let's say we try  to call a remote weather service to get the current weather in a given city. this
    remote call may fail for various reasons. Let's see how we can handle exceptions and recover by transforming an
    exception into a value.

    CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });

        the type of this exception doesn't matter. We just want to
        We don't see anything because this exception was thrown different threads.
        To get an exception, we have to call get() method of the future interface. If we look at the documentation of
        the future interface, we can see that the get() method returns a value of type V. And it may throw an exception
        of  type InterruptedException or ExecutionException. If an exception is thrown under the thread that executing
        our task, the get() method will be propagate ths exception and bring it into our main thread.

        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        Now we get the exception. We are trying to get the current weather, but we got an executionException. This
        exception is cause an illegalStateException. The exception that we threw in our lambda is wrapped inside an
        executionException. When we call the get() method, we may get an interruptedException.

        This happens if the thread is sleeping, but we are try to interrupt it

        or may get  an executionException. This happens if something goes wrong during the execution of our asynchronous
        task.

        Now we can get the actual cause of this exception by calling e.getCause()
        catch (InterruptedException | ExecutionException e) {
            e.getCause();
            throw new RuntimeException(e);
        }
        This will return the exception, that we throw here
            var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });

    We don't want our application to crash. What should we do here?
    In this case, we can recover and provide a default value like the last temperature that was successfully read before
    How to do that?
    Before we call a get() method, we call another method called
        exceptionally()
            future.exceptionally().get();
                The signature of this method, that maps the throwable of different type. Throwable class is the base or
                parent of errors and exceptions in java. In exceptionally() method we need to pass a lambda maps this
                exception to a different type. We can get this exception at map it to a numeric value like one. Let's
                imagine this is the last temperature that we read successfully.
                    future.exceptionally(ex -> 1).get();
                When we call the get() method, we get the result that is the last temperature
                    var temperature = future.exceptionally(ex -> 1).get();
                    System.out.println(temperature);
                We didn't get an exception this time. This is the benefit of using the exception of the method. One
                thing we need to understand is that this method will return a
                    new CompletableFuture. This  CompletableFuture is different from the one we originally created,
                    with this method reprogramming this CompletableFuture to return a default value if an exception is
                    thrown. When we call  the get method on this new CompletableFuture, we will get that default value.
                If we call the get() method at the original CompletableFuture will get an exception. This is something
                that we are going to see again and again throughout the section. A lot of the methods in the
                CompletableFuture class return a new CompletableFuture. With this we can build a recipe for asynchronous
                operations.


     */
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });

        try {
            var temperature = future.exceptionally(ex -> 1).get();
            System.out.println(temperature);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
