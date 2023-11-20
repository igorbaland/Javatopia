package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.atomicobjects;

import java.util.ArrayList;
import java.util.List;

public class AtomicObjectsDemo {
    /*
    Another way to achieve threads safely is by using the atomic classes in java.
        java.util.concurrent.atomic
    In this package we have a bundle of atomic classes, like atomic boolean, atomic integer, atomic long and so on.
    With these atomic classes we can perform atomic operations.

    For example, earlier we learned that incrementing a variable in java is not atomic.
    With these atomic classes we can increment or decrement a value field in an atomic way.

    In StatusDownload we need to change the type of totalBytes field from int to AtomicInteger and than we set it to a
    new AtomicInteger()
        private AtomicInteger totalBytes = new AtomicInteger();

        In our setter and getter methods, we call the methods
        totalBytes.get()    //return

        totalBytes.getAndIncrement();   //a++
        totalBytes.incrementAndGet();   //++a

    That is, tat is all we have to do. Now multiple-threads can modify this field concurrently
        without waiting for each other. If you are curious how atomic types work, they actually use a technique called
            compare and swap, which is supported by CPU's. Most CPU's can execute this operation as a single
            uninterruptible operation. When we call the increment and get methods, this atomic type is going to compare
            the current value with the expected value. If they are not equal it's going to swap them. For example, let's
    say the current value of total bytes is zero and we want to increment it. The expected value is one. Now this atomic
    type is going to compare these values, because they are different is going to swap them. This entire operation is
    natively supported by most CPUs as an atomic operation . If we are dealing with counter varibles prefer atomic types
    to synchronization, because they are
        faster and easier to use
     */

    public static void show() {
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (var i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(status.getTotalBytes());
    }
}
