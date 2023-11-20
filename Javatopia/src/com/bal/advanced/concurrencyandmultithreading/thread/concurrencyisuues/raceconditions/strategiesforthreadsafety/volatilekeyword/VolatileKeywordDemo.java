package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.volatilekeyword;

import java.util.ArrayList;
import java.util.List;

public class VolatileKeywordDemo {
    /*
    In java we have another tool for writing thread safe code, but without the overhead of synchronization.
       VOLATILE keyword, it's solves the visibility of the problem, but not the race condition. It doesn't prevent  two
       threads two modify some data. That ensure if one thread change some data, other thread see the changes.

    An example
    in our DownloadStatus class we added a boolean field and created getter and isDone methods. We want to create two
    threads in our demo  class.
        One thread simulates downloadingFile
            and the other  checks if the download is finished. When the download is finished, we want to report
            something to the user.
    In our thread2 we want to pass lambda expression to represent a runnable object. We could also create a separate
    class that implements the runnable interface. But we want to change things up for a little bit in show method. We
    pass a lambda expression (runnable interface). That is basically function with no parameters and returns void.

    In the body of this lambda, we should continuously ask the status object if it's done or not. We have a while loop,
    we ask the status object, are you done? As long as it's not done, we are going to wait
        while(!status.isDone()) {}

    We have a while loop with an empty body, we are just waiting. The moment our download is finished, we are going to
    print
        System.out.println(status.getTotalBytes());
    Run our program. Thread1 started and finished. But thread is still going, in fact it's going to go forever.
    Why is this happening?
    In our DownloadStatus, earlier we use synchronous keyword in two places in this class. How come the synchronous
    keyword didn't help us here? Well the secret keyword is not a silver bullet. In this particular case,  we want to
    make sure that only one thread at a time can update a synchronized field. But we are dealing with another field.
        isDone() : boolean
    These are two separate fields. If we want to solve the problem, we should mark these two methods as synchronized
         public synchronized boolean isDone() { return isDone; }
    But we told that this is a bad practice, we should prefer to use the synchronous block as opposed to declaring the
    entire method synchronized. But let's not worry about the problem with this approach and see if the synchronous
    keyword solve this problem. Thread is started and finished. The problem is fixed.

    Even  the synchronous keyword solve this problem, it can cause a lof of overhead. Because in this while loop, we are
    constantly calling the isDone method. While we are calling this method, no other threads can do anything else with
    this status object. They cannot call any other methods in this object. All this method calls with run in sequence.
    A better way
    In our downloadStatus, let's remove the synchronized keyword. Back to original problem. When we run this program,
    the second thread with indefinitely, because it doesn't see the change to the isDone field. This is the visibility
    problem. One thread changes some data, the other thread cannot see the change.
    But why does this happen?
    Well, java virtual machine makes
        some optimizations under the hood, to make our code run faster. One of these optimizations is
            caching values. Let's say we have an integer field with the value one. This value is stored in the
    main memory RAM. Now we have two threads running by two different CPU cores. Each CPU has a cache, which has a small
    amount of memory available locally at that CPU. Reading the data from the cache is faster, because the data is
    closer to CPU. It doesn't to ravel far. It doesn't have to travel between the CPU and the main memory. Okay. This is
    what happens, two threads read the value of field and stored locally. The first read changes this value, But this
    change is only local to the thread. The second thread doesn't see the change. Even it if writes the change back into
    memory. The second thread doesn't see the change, because it already  has the value of this field and its cash.
    This is the visibility problem
                                        CACHING

                      Integer value = 1             Cache 2=value      CPU1

                                                    Cache 1=value      CPU2


    To solve this problem without overhead of synchronization, we can declare this field
    as VOLATILE, means unstable

        private volatile boolean isDone;

    We are telling the java virtual machine, this field is unstable, it may change. Don't rely on the value stored in
    the cache. Always read it from the main memory. The change will be immediately written to the main memory.

    THE VOLATILE KEYWORD GUARANTEES THAT THE CHANGES TO A FIELD IS VISIBLE ACROSS THREADS.

     */

    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while(!status.isDone()) {}
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();


    }
}
