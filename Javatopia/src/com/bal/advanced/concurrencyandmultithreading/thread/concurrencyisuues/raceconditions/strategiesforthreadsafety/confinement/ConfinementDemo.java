package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.confinement;

import java.util.ArrayList;
import java.util.List;

public class ConfinementDemo {
    /*
    Let's see how we can use confinement to prevent race condition. Instead of showing a single status object across
    multiple threads, you are going to have each thread work with its own status object.

    We removed parameter status from our constructor dft>DownloadFileTask and added a new instance of DownloadStatus.
    We added dft to a list. With a list we can to sum all total bytes of each created instance ds>DownloadStatus. With
    a functional (declarative) programming we can simply sum total bytes.
     */

    public static void show() {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);

            var thread = new Thread(task);
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

        var totalBytes = tasks.stream()
                                    .map(t -> t.getStatus().getTotalBytes())
                                    .reduce(Integer::sum);
//                .reduce(0, (a, b) -> a + b);

        System.out.println(totalBytes);
    }
}
