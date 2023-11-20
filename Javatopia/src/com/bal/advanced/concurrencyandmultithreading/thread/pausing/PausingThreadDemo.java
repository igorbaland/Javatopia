package com.bal.advanced.concurrencyandmultithreading.thread.pausing;

public class PausingThreadDemo {
    /*
    The thread class in Java has
        a sleep() method
            which we can use
                for pausing the execution of a thread.
    With this, we can
        simulate a long running operation
            like downloading a file that takes
                a few seconds.

    Sleep(millis)

    If we run the program, we will see that these 10 threads will start at the same time.
        And after 5 seconds they all complete.

        Output:
            main
                Downloading: Thread-7
                Downloading: Thread-4
                Downloading: Thread-3
                Downloading: Thread-8
                Downloading: Thread-0
                Downloading: Thread-1
                Downloading: Thread-2
                Downloading: Thread-6
                Downloading: Thread-9
                Downloading: Thread-5
                Download completeThread-4
                Download completeThread-1
                Download completeThread-0
                Download completeThread-8
                Download completeThread-7
                Download completeThread-3
                Download completeThread-2
                Download completeThread-6
                Download completeThread-9
                Download completeThread-5

    If we had a single threaded application,
        downloading this 10 files
            would take 50 seconds instead of five seconds
                because each downloaded will start once another download finished.

    Multithreading
        makes our application faster
        and more responsive

    What if we try the download
        100 or 1000 files concurrently
            machine has
                4 cores
                8 threads

                How is that going to work?
                The JVM has what we call
                    a thread scheduler. The job of the scheduler is to decide
                        what threads to run for
                            how long.
                    If we have more tasks than the available threads, the scheduler switches between this tasks giving
                    a slice of the CPU time.
                        This happen so fast that give us the illusion that these tasks are being executed in parallel.
                        But that is parallelism at software level.

     */
    public static void show() {
        System.out.println(Thread.currentThread().getName());

        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
