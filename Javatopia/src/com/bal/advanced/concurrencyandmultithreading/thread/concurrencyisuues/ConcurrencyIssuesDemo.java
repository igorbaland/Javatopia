package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues;

public class ConcurrencyIssuesDemo {
    /*
    In all the examples I have shown you so far
        our download threads have been isolated from each other.
            But in a real scenario,
                sometimes our threads may need to access and modify shared resource

                                                    RACE CONDITION      VISIBILITY PROBLEM
                Thread1 ---->
                Thread2 ---->       totalBytes
                thread3 ---->

    For example, when downloading file, each thread may report the number of bytes it has downloaded to a shared object.
    But this object, we can keep track of the entire download progress and report it to user.
    Multiple threads access the same object, and at least one of them changes this objects, we are going into couple of
    issues.
        1. issue happens when multiple threads try to modify the same data´at the same time.
            It's like having one burger and three people wanting to it at the same time. It's not going work.
            If multiple threads try to change the same data, we may get the wrong results or our application may crash.
            When this happens,
                we say we have a race condition
                    which means multiple threads are racing or competing to modify the same data.
        2. Another issue happens when one thread changes  the shirt data,
            but the changes are not visible to other threads. Different threads will have different views of the shared
            data. That is what we call
                a visibility problem. If multiple threads access the same data and at the least one of them tries to
                change it, we are going have some problems. If they only want to read the shirt data, that is perfectly
                fine.
    By the way these problems are not specific to java. These are properties of concurrent systems. we have the same
    problem in databases because multiple users can modify the same data at the same time.

    If we want to build a multi-thread application, we need to have a proper understanding  of these problems and know
    how to prevent them. We should write code that can be safely executed by many threads in parallel. This is what we
    call
        thread-safe code
        It is one of those terms that we see in the java documentation a lot. Some classes are thread-safe
            which means they be safely use across many parallel threads.

     */

    public static void show() {
        System.out.println();
    }
}
