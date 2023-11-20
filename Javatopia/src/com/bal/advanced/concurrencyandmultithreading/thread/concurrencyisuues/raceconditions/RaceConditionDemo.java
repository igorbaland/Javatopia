package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions;

import com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.DownloadFileTask;

import java.util.ArrayList;
import java.util.List;

public class RaceConditionDemo {
    /*
    Let's see as part of downloading multiple files, we want to show the total number of bytes we have downloaded so far
    we need
        to store the total number value somewhere and
            have multiple threads incremented as they are downloading files. This is going
                to cause a race condition,
                    which means multiple threads racing or computing to modify a shared resource.

    We should pass this status object each DownloadFileTask
        new Thread(new DownloadFileTask(status));

    We are starting 10 down with threads and
        sharing a single object status across these threads.
            Once all these threads are complete, we should print the total number of bytes we have downloaded.
                We have to wait for all these threads to finish.

    We can not call thread.join(),
        because this will make the main thread wait
            for each download to finish
                before starting another download. Because join method is a blocking method. In the first  iteration,
                    we create a thread
                        we started,
                            and then we wait for that thread to finish before going to the second iteration/to create a
                            second thread
    We can't the join method there, we should start all the threads simultaneously. we didn't join with all of them.

    Let's declare a list of threads. Every time we start a thread we add it to our list.
    We need another loop to iterate over  all these threads and join with them

    We are expecting 100_000 (10 x 10_000)
    But if we run our program we see a different number. This is a race condition in action
        Because multiple threads are racing or competing to update the totalNumber of bytes.

    What happens under the hood?
    Imagine 2 threads are trying to call into increment method (DownloadStatus class) at the same time. Let#s say the
    value of this field is zero. All this threads will read this value concurrently. They both incremented and write it
    to memory.  The result will be one instead of two

                    Thread 1                Thread 2
                    |                       |
                    | Read 0                | Read 0
Increment 0;        |                       |
                    |Incremented            | Incremented
                    | Write 1               | Write 1
Increment 1;
                    | Read 1                | Read 1
    This is how we lose an update.




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
