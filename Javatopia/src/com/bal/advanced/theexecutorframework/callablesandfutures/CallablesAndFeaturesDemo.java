package com.bal.advanced.theexecutorframework.callablesandfutures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CallablesAndFeaturesDemo {
    /*
    Sometimes we will return a value from a task. For example, we may call a Twitter API to get the latest tweets for a
    given user. That is when we use the
        callable interface. If we look at the signature of the
            submit method, we can see that this method is overloaded. So far, we can pass a runnable object to this
            method. But we can also pass a
                callable object is callable. This Callable object is an interface, very similar to the runnable
                interface. But this interface represents a task that returns a value. This method has a single abstract
                method called call(). This is similar to the run method of the runnable interface. But instead of
                returning void,
                    it returns V,
                        where Vis the generic type parameter.

    If they return a value in body of this lambda

            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return 1;
            });
        Now this lambda matches a method with no parameters that returns a value are called method (call() of Callable)
        This lambda expression that we have pass here, represent a callable object. We store the result in a variable
        called future.
            var future = executor.submit(() -> {
                                    System.out.println(Thread.currentThread().getName());
                                    return 1;
            });
                the type of thi variable
                    Future<Integer>
                        This future is an interface that represents the future result of an operation. An operation that
                        will complete in the future. It may complete in 500 milliseconds or two second or five seconds,
                        sometime in the future. The result of this operation is not going to be calculated immediately
                        using the CPU. With this future object, we can get the future resolved on operation.

    To make this demo more interesting, let's simulate a long running operation. Create a new LongTask class. We are
    simulating an operation, that's going to take three seconds. Let's say, we are going to call the Twitter API to get
    the latest tweets for user. But eventually, this task is going to return a value in this case 1.
    When we call the submit method, the submit is going to return immediately, it's not going to wait for three seconds.
    It's going to immediately return a future object. With this future object, we can get the result of this operation.
        This object has a bunch of useful methods
            get(long timeout, Timeunit unit),
            we use this to get the value of this operation that getting overloaded, with this version, we can pass a
            timeout. So if the operation is going take so long, perhaps we don't want to wait forever.
            We want a timeout, let's say two seconds.

            get()
            call the get method without a timeout value

            cancel()
            for cancelling an operation

            isCancelled()
            we can check to see if this operation is cancelled

            isDone()
            tell us if this operation is complete or not.

    This submit() method is going to return immediately. Here we can do some work...
            System.out.println("Do more work");
            try {
                var result = future.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

            When we run this program, we will see that we imemediately see this message on a terminal,
                System.out.println("Do more work");
            because the submit method is not going to wait for the completion of this task.
                executor.submit(() -> {
                    LongTask.simulate();
                    return 1;
            It's going to start this task on a separate thread. And eventually when we call
                 var result = future.get();
                    we have to wait for this operation to complete
    */

    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        try {
            var future =executor.submit(() -> {
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
        }
        finally {
            executor.shutdown();
        }
    }

}