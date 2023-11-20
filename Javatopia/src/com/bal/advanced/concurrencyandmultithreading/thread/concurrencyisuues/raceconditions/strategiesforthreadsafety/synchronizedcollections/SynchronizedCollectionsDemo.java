package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.synchronizedcollections;

import java.util.*;

public class SynchronizedCollectionsDemo {
    /*
    Sometimes we need to share a collection across many threads.
    Race condition, 2 threads are racing or competing to modify our collection concurrently.
    To solve this problem, we can use a synchronous collection, which is wrapper around a regular collection type in
    Java. Instead of sending this collection to a new ArrayList, we are going to call collections. This class has a
    bunch of static factory methods for creating synchronous collections. We have synchronous collection.

        Collection<Integer> collection =
                Collections.synchronizedCollection(new ArrayList<>());

    Internally our objects are stored inside this ArrayList, But when we call this method, this method is going to wrap
    this inside the synchronize collection in that synchronous collection. All the methods like
        add, remove and so on... They have synchronization code. Synchronous collection essentially wraps a regular
        collection  like an ArrayList. But it makes it synchronized.

    With this simple change, when we run  our program, we can see that two threads modify our collection currently.
    This is how we can
     */

    public static void show() {
        Collection<Integer> collection =
                Collections.synchronizedCollection(new ArrayList<>());

        var thread1 = new Thread(() ->
            collection.addAll(Arrays.asList(1, 2, 3))
        );

        var thread2 = new Thread(() ->
            collection.addAll(Arrays.asList(4, 5, 6))
        );

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(collection);
    }
}
