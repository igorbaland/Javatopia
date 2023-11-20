package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety;

public class StrategiesForThreadSafety {
    /*
    Strategies
    We have a few strategies for writing thread safe code. That is code that can be safely executed across multiple
    threads.

        1. The simplest solution is not to share data across threads in the first place. This is called
            CONFINEMENT, because we want to confine or restrict each thread to have its own data. For example, instead
            of sharing a download status object across many download tasks,
                we could have each download tasks have its own download status object. When all these tasks are complete,
                we can combine the result. This is the simple strategy.

                previously
                thread1 --->
                thread2 --->    StatusObject
                thread3 --->

                confinement
                thread1 --->    StatusObject --->
                thread2 --->    StatusObject --->   CombineResult
                thread3 --->    StatusObject --->

        2. Another strategy is using immutable or unchangeable objects. An object is immutable, if it's state or data
        cannot be change after it's created. For example, the string class in java is immutable. If it convert a string
        to uppercase, we get a new String object. The original string is not changed.
            Sharing immutable objects between threads is totally fine because these threads can only read immutable
            objects, they cannot modify them.

        3. Another strategy is to prevent multiple threads from accessing the same object comparatively. This is called
        SYNCHRONIZATION, because we synchronize or coordinate the access to an object across different threads.
            We do that by using locks. We put a lock on certain parts of our code and only one thread at a time can
            execute that part, other threads have to wait. Synchronization forces the code to run sequentially, which
            is again the idea of concurrency

            thread1 ------------->
                thread2 --------->  Lock
                    thread3 ----->

            implementing synchronization is challenging, and error prone. One of the problems we run into
                DEADLOCK, which happens when two threads wait for each other indefinitely. Thread one waits for thread
                two and at the same time, thread two waits for thread one. That's a deadlock and cause your application
                to crash. Generally we are speaking,
                    synchronization is bad and, we should avoid it as much as possible.

        4. Another strategy is to use ATOMIC classes in Java like ATOMIC INTEGER. These classes allow us to achieve
        thread safety without using locks. If we increment an atomic integer, the Java virtual machine will execute the
        increment operation as a one single atomic operation. It's not going to break it down into three smaller
        operations. That's why they are called atomic. They are like atoms, they cannot be broken down

        5. Finally, another strategies is partitioning data into segments that can be accessed concurrently. Java
        provides
            a number of collection classes
                that support concurrency
        Multiple threads can access a collection object, but only one thread at a time can access a segment in that
        collection.

        These are five common strategies we have for writing thread safe





     */

}
