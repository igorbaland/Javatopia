package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.synchronisedkeyword;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();


    public void incrementTotalBytes() {
        /*
        monitor object. Every object in java has a built block. Java is going to get the building block from an object
        and use it under the hood. For example, we can pass
          "this" as a reference to the current object.

              synchronized(this)

            The problem is fix. But why is passing
                "this" is a bad practice?
            Let's add another field
                totalFiles
                    With this we can keep track of how many file we have successfully downloaded so far.
                    we created the same methods get and incremented for a totalFiles with implementation synchronized.
            With this implementation, if one of thread is calling the incrementTotalFiles method
                another thread cannot call the incrementTotalBytes method, because both these methods are using the same
                    monitor object. Only one thread at a time can call into a synchronous method of this object. This is
            like having a single hotel room. It's monitor object represent a hotel room. With this implementation, if
            one thread is calling the incremental is updating the totalBytes
                another thread cannot update the totalFile. That is going to cause a lot of overhead. The whole point of
                synchronization is to make sure that two threads cannot modify the same at the same time. But here we
                are dealing with two different fields. Using the same monitor object reduces the throughput of this
                class, it can cause unnecessary weights.
            In a simple application with a few threads, we may be able to get away with it, but in larger application
            with more concurrency requirements, you should use
                dedicated monitor objects

                    private Object totalBytesLock = new Object();

                        Why object? it#s just common convention. Technically, we could use any type, but it's more
                        conventional to use the object class because we are not looking for any specific behaviors.

                        synchronized (totalBytesLock)

            There is another way to use the synchronized keyword. Instead of using it as a block, we can declare this
            entire method as synchronized

                public synchronized void incrementTotalBytes(){}
                    and this is exactly equivalent to writing
                        synchronized(this)
                            This will wrap this entire method inside the synchronized block. Again, we should be
                            cautious about this approach, because this is going to synchronize the current object. And
                            as I told earlier, this can cause a lot of unnecessary weights. It is better to use the
                            synchronized block with a dedicated monitor object.

            All that aside, synchronization is bad. Your code runs sequentially and you lose concurrency. Also, you may
            cause deadlocks and all sorts of crazy bugs that are hard to reproduce and fix. As a best practice, don't
            use it in new code. I just included in this course, because you are maintaining older code base that uses
            synchronization to understand what it is and how its work.
         */
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public synchronized void incrementTotalFiles() {
            totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    @Override
    public String toString() {
        return String.valueOf(totalBytes);
    }
}
