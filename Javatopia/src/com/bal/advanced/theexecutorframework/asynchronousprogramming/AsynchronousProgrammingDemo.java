package com.bal.advanced.theexecutorframework.asynchronousprogramming;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class AsynchronousProgrammingDemo {
    /*
    In the last section, we told that this
        get() method is
            a blocking method. Where we call it, the current thread has to wait until result of this task
        is ready.  Even through we are executing this task in a separate thread, we are making the current thread wait
        for the completion of the thread. We are not using our thread properly, we are waisting our threads, that this
        is very simple application, this is a commandment application.
            But if we have a mobile or desktop app, this main thread would be responsible for handling the UI events
            such as mouseclick and keystrokes. If we make the main thread wait for the completion of another thread. It
            is not going to be able  to respond to the UI, our application window is going to freeze and the user is not
            going to be able to resize or move it. To get the most out of our threads, we should write in a
                non-blocking way and that is what we call
                    asynchronous programming. Asynchronous is one of those fancy computer science terms but basically
                    it means
                        Asynchronous = non-blocking
    This code that we have here
        var result = future.get();
            is a synchronous code. It's blocking, we want to write code in a non-blocking way.

    As a metaphor, think of a restaurant, when we go in a restaurant, order our food, the waiter comes, takes our orders
    a passes it to the kitchen. He doesn't have to sit there, wait for the kitchen to prepare your food before saving
    another guest. He can go serve someone else in the meantime, so that later that resource is like a thread in our
    application. We don't to make our main thread or another thread wait for the completion of another thread as much
    as possible. We want to orchestrate our tasks such when task completes, another task can get executed
    asynchronously.

    In 2014, Java gave us a new tool for implementing this kind of applications, asynchronous applications.
     */

    public static void demo() {
        var executor = Executors.newFixedThreadPool(2);
        var future = executor.submit(() -> {
            LongTask.simulate();
            return 1;
        });

        System.out.println("Do more work");


        try {
            var result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        finally {
            executor.shutdown();
        }
    }
}
