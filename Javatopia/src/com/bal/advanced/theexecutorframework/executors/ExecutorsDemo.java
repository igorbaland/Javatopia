package com.bal.advanced.theexecutorframework.executors;

import java.util.concurrent.Executors;

public class ExecutorsDemo {
    /*
    In java, the concept of thread pool is represented using the
        ExecutorService interface and its implementation.
        ThreadPoolExecutor,
        which is  a typical thread pool implementation.  This is one that we use most of the
        time.

        ScheduledThreadPoolExecutor, with this we can schedule tasks to run after a delay or periodically.
        For example, we can schedule a task to run five hours from now or every two hours

        AbstractExecutorService

        ForkJoinPool
        This is a special type of pool that is designed to recursively split a task into smaller tasks, and then combine
        the result of each subTask to produce the overall result. That's like a divide and conquer algorithm.

        Executors
            java.util.concurrent
                This class has a bunch of static factory methods for creating an ExecutorService.  With these methods,
                we can create an instance of these implementations (above - AbstractExecutorService,
                ScheduledThreadPoolExecutor...)
            We can call a
                newSingleThreadExecutor
                    this returns an executor with a single thread. That's something that we used that often.
            We also have
                newFixedThreadPool
                    it will create a thread pool with a given number of worker threads. That would be an instance of the
                    ThreadPoolExecutor class
            We also have
                newScheduledThreadPool
                    this will return an instance of the
                    Scheduled ThreadPool



        Why shouldn't we create a new intstance ThreadPoolExecutor or directly?
        We can definitely do that. But it is a little bit difficult.
            If we type new ThreadPoolExecutor, this constructor has a bunch of parameters like
                corePoolSize, maximumPoolSize... Create an executor explicitly is a little bit difficult. That is why -
                use the factory methods on the
                    Executors class.

    Let's call
        Executors.newFixedThreadPool(2)
            (2) -> with 2 worker threads
                no we store the result in a variable call
                 var executor = Executors.newFixedThreadPool(2);
                    ExecutorService type of this variable, we are dealing with an interface here.
                        At runtime , the type of this object is going to be
                            ThreadPoolExecutor
                                if we print
                                System.out.println( executor.getClass().getName());
                                    show executors class
                                        java.util.concurrent.ThreadPoolExecutor
                                        That is a
                                            ThreadPool with a number of worker threads

                We have a variable executor. Now we can call
                    executor.submit(),
                        to submit a task
                            to the ThreadPool
                    submit method is overloaded. We cann pass
                        Runnable object
                        Callable<T> task
                            the task it returns a result
                        Runnable task, T result


    executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
    If we run this program, we can see our task was executor on this pool-1, thread-1
        pool-1-thread-1
    We didn't have to explicitly create a thread. But if we have 1000 tasks, we don't have to worry about creating too
    many threads are running out of the memory. We simply submit those tasks that is executor throw thread pool. And
    this pool will assign our tasks to work as thread.
        We have a pool with 2 threads
            Executors.newFixedThreadPool(2);
            let's add a for loop
                for (var i = 0; i < 10; i++)
                    in iteration with submit() a task to this pool, we have only 2 threads available, but we are
                    submitting 10 tasks

            for (var i = 0; i < 10; i++)
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
                pool-1-thread-1
                pool-1-thread-2
                pool-1-thread-2
                pool-1-thread-1
                pool-1-thread-2
                pool-1-thread-1
                pool-1-thread-2
                pool-1-thread-1
                pool-1-thread-2
                pool-1-thread-1

            Some tasks are being executor on thread one,
                other tasks are being executor on thread two
    Internally this execute and maintains a queue, every task that was submitted,
        goes in this
            queue and waits for an available thread.

    If we run a program, we get a intelliJ dialog box saying:
        that our program still running
        Why is that?
        Because when was trying to execute and submit a task, the
            executor thinks, there might be more tasks coming in the future. It's not going to terminate. It's going to
                stay in memory waiting for new tasks. We have to explicitly shut down an Executor to terminate our
                program.
    To do that we call
        executor.shutdown
    We also have
                .shutdownNow()
                    difference is that the shutdown() method doesn't stop the current tasks. It will wait for the
                    completion of those tasks, but it's not going to accept any new tasks. In contrast, if we call
                        shutdownNow(), this will force the existing tasks to stop.

    What if something goes wrong over here
         executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });
    or we have some code and this code throws an exception. With that, we are not going be able to shutdown() an
    executor properly
          executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        // ...
        executor.shutdown();

    As a best practice, we should run this inside a try finally block. This will make sure that no matter what we always
    shutdown() on executor and release it from memory. This is the benefit of using the executor framework.
    With this will make sure that no matter what we always shutdown on executors it from memory. This is the benefit of
    using the
        executor framework. We don't have to worry about thread manipulation anymore. We let Java, we let the
            executor framework take care off all of that. But we have to remember, even when using the executor
            framework, we still  have to worry about the
                concurrency problems. If two tasks, modify an object  currently we are going to run into issues. The
                executor framework does not protect us from
                    concurrency problems we talked about it.
                        It just simplifies thread manipulation.

     */


    public static void show() {
        var executor = Executors.newFixedThreadPool(2);
        try {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        finally {
            executor.shutdown();
        }

    }

}
