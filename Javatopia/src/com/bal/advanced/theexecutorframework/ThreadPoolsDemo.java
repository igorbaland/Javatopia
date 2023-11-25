package com.bal.advanced.theexecutorframework;

public class ThreadPoolsDemo {
    /*
    Threads are the fundamental building blocks of concurrent applications. But working directly with threads has a
    couple of problems
        AVAILABILITY
        1. problem is that we have
            limited number of threads available to us.
                If we are not careful, we may end up creating too many threads and get OutOfTheMemoryError, our
                application will crash.
        COST
        2. Problems that
            creating and destroying threads is costly.
                If we have 1000 tasks to execute, like 1000 images to download and only 10 threads available, we have to
                download 10 images using this threads. Then once of these threads are complete, we have to create
                another set of 10 threads and we have to repeat this several times to execute our tasks.
                    Creating of the threads is expensive.

    Java 5 came up with a solution called a
        THREAD POOL
            is essentially a pool of threads called
                WORKER THREADS.
                    This thread can be reused to execute a several tasks. When a worker thread will finish,
                        is returned back to the pool,
                            it can be reused to execute another task. These threads are not destroyed and recreated,
                            they are always available and are reused to execute many tasks. Also, because the thread
                            will has a fixed number of threads, we don't have to worry about
                                creating too many threads and running out of the memory. For example, we can create a
                                    thread pool with 10 threads an submit 1000 tasks thread. The thread pool would take
                                    care of assigning our tasks to this thread. If all threads are busy, then new tasks
                                    will wait in queue. As soon as the thread becomes available, it will pick up a task
                                    from the queue and execute it.

                                        THREAD POOL

                    worker thread               Work
                    worker thread               Work
                    worker thread               Work

                    Queue
                    [][][]

    With this model we don't have  to think about creating for us directly. Instead, we submit our tasks to
        a THREAD POOL and let
            the THREAD POOL take care of thread granulation.
     */

}
