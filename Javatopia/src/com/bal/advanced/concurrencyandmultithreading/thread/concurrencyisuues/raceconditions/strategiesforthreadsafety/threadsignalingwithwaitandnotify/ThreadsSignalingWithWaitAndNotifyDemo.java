package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.threadsignalingwithwaitandnotify;

public class ThreadsSignalingWithWaitAndNotifyDemo {
    /*
    Sometimes we don't want thread to wait until some condition becomes true.
    For example
         while (!status.isDone()) {}
            The second thread has to wait until the done field becomes true. We are implementing using a while loop with
            the empty body.
                The problem with this implementation is that we waste sequel circles. Because this while loop is
                continuously running until the done field becomes true. Run millions or even trillions, it's waste
                a sequel circles.
    We can solve this problem, by using the
        WAIT() and NOTIFY() method. Every object in java has these two methods. These methods are inherited from the
        OBJECT, which is the parent of all classes in java.
            while (!status.isDone()) {
                status.wait();
            }
                And this will make go to sleep until another thread notify this thread, the state of the status object
                is change. When we call the wait method, this while loop is not be run a million times. In the first
                iteration, this wait() method is gonna put a thread into sleep until another thread wait wake up.
            We need to handle InterruptedException
                while (!status.isDone()) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            This is the body of our while loop

            The JVM expat us, to call the wait method inside the synchronized block
                while(!status.isDone()) {
                    synchronized (status) {
                        try {
                            status.wait();
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            In our DownloadFileTask, after
                status.done();
            we need to notify, that the state of this is change
                status.notify();

                We also have notifyAll(), it is useful when we have
                    a multiple threads
                        waiting for change of this object
                            With this we can notify  all.

            Just like a wait method
                we need to wrap this line inside the synchronized block. Otherwise, the JVM is going
                    throw a runtime exception

                    synchronized (status) {
                        status.notifyAll();
                    }

    With this implementation
        the moment, the second thread get started,
            this while loop is going start
                and in the first iteration the wait method() is going put this method to a sleep. So the while loop is
                not get executed a million times.
    The moment the first thread finished this job
        1_000_000, is going to notify() the second thread.
            The second thread is going wake up
                and print the totalBytes.

    This is more efficient implementation, when a while loop with an empty body, that runs a million times. Wait and
    notify get a pretty tricky in complex application. If we don't use them properly, we are gonna run into trouble. I
    would say, don't use a newer code, for these ways we have a better tools for implementing this kind of
    communication between threads, we are look at them in the next section. I just want briefly to talk about wait()
    and notify() method, in case if we have to see them, what they are and how these works.
     */

    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}
