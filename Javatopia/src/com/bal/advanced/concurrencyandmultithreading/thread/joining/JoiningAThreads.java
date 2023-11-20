package com.bal.advanced.concurrencyandmultithreading.thread.joining;

public class JoiningAThreads {
    /*
    Let's say one we download a file, we want
        to kick off another thread
            to scan the downloaded file for
                viruses

    Scanning a file is a type consuming task. It's not going to happen immediately like incremental an integer. It may
    take a few seconds, so we should run it in a separate thread. But we should do that only after we have downloaded
    the file. Here is the thing.
        How can we know if the download thread are finished?
        Downloading a file may take a second, a minute or longer, we can not predict it.
            We cannot use
                thread.sleep() to make the current thread sleep for 5 seconds, because the download make take longer.
                    To solve this problem, we should
                        join threads

    After we start the download thread we call
        thread.join();
            This will make the current thread
                that is the main thread that is executing this code
                    wait for the completion of the download thread.

            is going to block the current thread
                until that the download thread has finished.
                    once this method returns , then we can print
                        thread.join();
                        System.out.println("File is ready to be scanned");

            throws an interrupted exception

                Output:
                Downloading: Thread-0
                    Download complete: Thread-0
                    File is ready to be scanned


    With a join method
        we tell
            the current thread
                to wait for the completion of another thread
                For example, in the case of a desktop or a mobile app, this thread main thread is responsible
                    for handling UI event like
                        mouse clicks and keystrokes. If we make the main thread wait for another thread it cannot
                        respond this UI advance while it's waiting. The UI will freeze and the user will not be able to
                        resize or move the application window.
    We will learn a better way to have one task start after another task finishes without causing the current threat
    wait. For now,

     */
    public static void show() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File is ready to be scanned");
    }
}
