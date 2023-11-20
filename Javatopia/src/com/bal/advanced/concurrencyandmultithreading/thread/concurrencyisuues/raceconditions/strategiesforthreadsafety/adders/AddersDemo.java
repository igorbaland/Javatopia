package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.adders;

import java.util.ArrayList;
import java.util.List;

public class AddersDemo {

    /*
    Atomic objects are great for implementing counters. But if we have a multiple threads updating a value frequently
    it is better to use one of the other classes in java. They are faster than atomic types. We have a
        LongAdder
            for adding long values
        DoubleAdder

    How they work
        private LongAdder totalBytes = new LongAdder();
            totalBytes.intValue();
                        byteValue
                        shortValue...
    Internally, this LongAdder object keeps an array of counters that can grow on demand. We don't have a single place
    in memory, where our value is stored. We have a bunch of array cells, each holding a counter value. Different
    threads can modify this counter variables concurrently. That is why these other classes are faster than atomic types
    because they allow more throughput.
        Internally call
            sum() method
                which is going to add up all this counter values and return the result. The invaluable call this method
                and then convert the result to an integer
    In our increment method we call
        increment
        decrement...


    If we have multiple threads updating a value frequently preferred the outer classes to atomic types.


     */

    public static void show () {
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
