package com.bal.advanced.concurrencyandmultithreading;

public class ProcessesAndThreadsDemo {
    /*
    Let's start this section with a quick overview of
        the key terms and ideas in concurrent systems.
            Process
                is an instance of a program or an application. When we  launch an application like your editor or music
                player,
                    your operating system loads that application inside a PROCESS.
                Process containts an image of
                    application code. It has
                        some memory and a bunch of other resources.
                Now your operating system can execute many processes at the same time.
                For example,
                    it can run an antivirus while playing music.
                        That's concurrency at the process level.
                But we can also have concurrency within the process or within the application using treats. Technically
                We are speaking,
                    a thread is a sequence of instructions.
                        That is why it's called a thread. It is like a thread of instructions. Practically speaking
                            a thread is actually that thing that executes your code.

                Each process has at least one thread called
                    the main thread, but we can create additional threads to run many
                        tasks concurrently.
                For example,
                1. we can build a web server
                    that can serve many clients at the same time.
                        thread1     ---> Client1
                        thread2     ---> Client2
                        thread3     ---> client3
                    We serve each client using a separate thread.
                2. Or we can build an application that downloads multiple images concurrently. We do this by starting
                multiple threads and have each thread download a separate image
                        thread1     ---> Download1
                        thread2     ---> Download2
                        thread3     ---> Download3

                This what we call
                    > MULTI-THREADING
                    Application that use multiple threads are called
                        multi-threading applications
                These days most processors have multiple cores and this cores can be used
                    for running many processes or threads. If our application doesn't use threads, is essentially using
                    only one of the processors cores. It is not utilizing the full power of our CPU, your hardware is
                    wasted.

    Thread
        activeCount()
            returns the number of active threads in the current process
                using threads: 2
                    This program is using two threads. One of them is main thread that is running our
                        main method.
                    The other is a background thread that runs
                        the garbage collector. This garbage collector removes unused objects from memory.

    Runtime
        getRuntime().availableProcessors()
            get the total number of available threads
        Our program is using two threads,
            > but we have eight threads available. This number may be different on different machine.
                My machine has
                    four cores and
                        each core ha two threads

    Eight available that We can use to run things parallel. To exploit parallel hardware, we should learn
        > the threads
        > to pause them
        > interrupt them
            > more importantly
            how to safely share data between them. Because if two threats try to change some data at the same time,
                crazy things can happen. We will talk about that later in the section
     */
    public static void show() {
        System.out.println("using threads: " + Thread.activeCount());
        System.out.println("Runtime: " + Runtime.getRuntime().availableProcessors());
    }

}
