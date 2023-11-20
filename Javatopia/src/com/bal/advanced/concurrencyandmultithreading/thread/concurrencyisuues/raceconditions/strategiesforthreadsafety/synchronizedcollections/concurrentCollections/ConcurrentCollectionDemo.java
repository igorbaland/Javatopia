package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.synchronizedcollections.concurrentCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionDemo {
    /*
    Synchronous collections achieve thread safely by using locks. When a thread gets access to a  synchronous
    collection, the entire collection gets locked and other threads have to wait. This works well for most cases, but it
    can have a negative impact on the
        performance and
        scalability as the number of threads and concurrent operations increase.
    In those situations, we can use concurrent collections in Java. These classes use the partitioning technique to
    allow concurrency. They divide their data into  segments and different threads can concurrently work with different
    segments, but only one thread at a time can access a given segment.
        Concurrent collections are faster than synchronous collections, because they don't use synchronization. These
        classes are declared in the
            java.util.concurrent
                For example, we have ConcurrentHashMap, ConcurrentLinkedDeque and so on...

    If we want to create a regular HashMap,
        Map <Integer, String>  map = new HashMap<>();
            map.put(1, "a");
            map.get(1);
            map.remove(1);
        This is a regular HashMap implementation, that is not thread safe.
            If it's going to get accessed only a single thread, it's perfectly fine.
            But if we want to share this across many different threads we are going to have problems.

    To solve this, all we have to do is to replace the HashMap with the concurrent HashMap. That's all we have to do
        Map<Integer, String> map = new ConcurrentHashMap<>();
    Everything else in our code stays the same, because this map is an interface. HashMap and ConcurrentHashMap are two
    different implementations of this interface. By programming against interfaces, we reduce the impact in our
    applications. We simply substitute one implementation with another, everything else stays the same.

    Again, I cannot emphasize the importance of interfaces enough. A lot of developers don't understand the interfaces.
    They think they do, but honestly  they don't.
     */

    public static void show() {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);
    }
}
