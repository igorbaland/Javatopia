package com.bal.advanced.concurrencyandmultithreading.thread.starting;

public class StartingAThreadDemo {
    /*
    The creative thread in Java, we use thread class that declared in the java.lang package.

    The construct of thread class is overloaded. The version that we use
        most often is the
            Runnable object
                That is the object that implements the
                    runnable interface.
        Runnable interface represents a task
            to be run a thread. it's a very simple interface with a single method called
                run() : void
                     It has no parameters and returns void.

    Let's say we want to download magnifiers concurrency. The tasks that we are dealing with here is
        the task of downloading a file.

    This is how we can create a new thread
        Thread thread = new Thread(new DownloadFileTask);
            thread.start()
                the code of downloading will be executed in a separate thread

    How to verify
        Before we create a thread, let's print the name of the concurrent threat
            Thread.currentThread().getName()
                currentThread()
                    return the current thread
                        each thread has a
                            NAME and
                            ID ---> getId()
    Let's add in our concrete class the name of the current thread while downloading a file.

    Output:
        1. main
        2. Downloading a fileThread-0
            We have two threads.
                One is the main thread that executed our main method
                And here is another thread that we explicitly created for downloading a file.

                Each thread
                    starts
                        executes a task
                             and then dies
                We don't have to explicitly kill it.

    Let's make this example more interesting
    Let's wrap out thread inside a for loop to simulate downloading 10 file
        concurrently
            for (var i = 0; i < 10; i++) {
                Thread thread = new Thread(new DownloadFileTask());
                thread.start();
            }
    Take a look. We have the
        main thread plus
        10 extra for downloading 10 files concurrently. Even thought these messages are appearing sequentially on the
        terminal. All these threads start and run in parallel.

     */
    public static void show() {
        System.out.println(Thread.currentThread().getName());

        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
