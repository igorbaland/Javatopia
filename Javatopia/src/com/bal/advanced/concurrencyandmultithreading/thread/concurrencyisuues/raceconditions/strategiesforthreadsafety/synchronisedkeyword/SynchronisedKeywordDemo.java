package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.synchronisedkeyword;

import java.util.ArrayList;
import java.util.List;

public class SynchronisedKeywordDemo {
    /*
    We learn how to use the locks to implement synchronization. In java, we have another tool for implementing
        synchronization. And that's the
            synchronous keyword. Because in the synchronous keyword, we can achieve the same result. But without
            explicitly creating a lock object, and locking and unlocking it.
                our code look simpler.

     */

    public static void show() {
        List<Thread> threads = new ArrayList<>();

        var status = new DownloadStatus();

        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(status));
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
