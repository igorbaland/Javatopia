package com.bal.advanced.concurrencyandmultithreading.thread.interrupting;

public class InterruptingThreadDemo {
    /*
    Quite often when dealing with long live tasks, we want to give our users
        the ability to cancel.
    Let's say, we want to cancel started thread after one second.
        In our DownloadFileTask
            Instead of passing thread.sleep() to simulate a long running task, let's
                add a for loop that continuously print a message on the terminal.

                    for(var i = 0; i < Integer.MAX_VALUE; i++)
                        System.out.println("Downloading byte " + i);

                with this we can easily verify if our download actually gets cancelled

    add cancel thread after one second
        Thread.sleep(1000);

        We are starting a separate thread to download a file
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
                then we have the current thread, that is the main thread that is executing
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    wait for one second

        to cancel the download thread, we call
            thread.interrupt()
                The reason our download thread didn't stop is
                    that calling the interrupt method doesn't force the thread to stop. It simply sent an interrupt
                    request to the thread. It's up to that thread to decide if we should stop what it's doing.
                In our DownloadFileTask we should continuously check for an interrupt request. If we get that request
                that will have to stop the download. Let's add a code block.
                    first we check for an interrupt request.
                        //we can access the current thread
                        if (Thread.currentThread())
                            //than call isInterrupted()
                            if (Thread.currentThread().isInterrupted())
                                if this return true,
                                    then we can break;
                                        out of this loop or simply
                                            return;
                                Otherwise, we are going to download the byte
    After one second our download stopped.

    Remember, the interrupt method does not force the thread to stop!
        What it's doing
            it simply sends
                > an interrupt request
        To support interruption we should constantly check for the interrupted requests and act accordingly.

    If a thread is sleeping, and we send an interrupt request to it,
        it throws an exception. That is why you have handle this interrupted exception
            when we are pausing a thread



     */
    public static void show() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();
    }
}
