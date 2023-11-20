package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class LocksDemo {
    /*
    Synchronization/Locks
        for prevent race condition and
        visible problems is to prevent multiple threads from accessing an object at the same time. This is called
        synchronization. We have to synchronize or coordinate multiple threads trying to access an object. We do that
        using locks. We put a lock on a block our code and the jvm will ensure that only one thread at a time can
        execute that block of code, which is called CRITICAL SECTION. In reality, our code is going to get executed
        sequentially.
        We use concurrency as a metaphor. Think of hotel room. Only one quest at a time can be in that room. When it
        gets goes in there, lock the door, others cannot enter. They have to wait until that guest checks out. Using
        locks and code is pretty  much the same. You have the same concept in databases as well.

        Sequentially    1       Thread1     ---------------->
                        2           Thread2     ------------>       Lock,   Critical Section
                        3               Thread3 ------------>


    How to use lock
    DownloadStatus class
    1. we are declaring an interface lock
        Lock lock=
            and instance a concrete (implemented) class ReentrantLock(); (reentrant wiedereinsteiger)
            Lock lock = new ReentrantLock();

    2. In our  incrementTotalBytes method before increment field we add our short-live variable lock and call the method
    lock() of concrete/implement class ReentrantLock()
        lock.lock();
    After increment we unlock our increment
        lock.locks();
        totalBytes++;
        lock.unlock();

    As a best practice we should execute this line in a finally block, because if an exception is thrown,
        > we don't want to keep this lock locked forever
            Otherwise no other threads can execute this code. And it's because of deadlock and our application will
            crash.

            lock.locks();
            try {
                totalBytes++;
            }
            finally {
                lock.unlock();
            }
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

        System.out.println(status);

    }
}
