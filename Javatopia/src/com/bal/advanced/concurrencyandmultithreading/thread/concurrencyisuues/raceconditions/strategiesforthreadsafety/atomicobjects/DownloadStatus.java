package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.atomicobjects;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalByte = new AtomicInteger();
    private boolean done;

    public boolean isDone() {
        return done;
    }

    public void done() {
        done = true;
    }

    public int getTotalBytes() {
        return totalByte.get();
    }

    public void incrementTotalBytes() {
        totalByte.incrementAndGet();
    }
}
