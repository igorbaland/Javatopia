package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.volatilekeyword;

public class DownloadStatus {
    private volatile boolean isDone;
    private int totalBytes;
    private int totalFiles;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();


    public void incrementTotalFiles() {
        synchronized (totalBytesLock) {
            totalFiles++;
        }
    }

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public int getTotalFiles() { return totalFiles; }

    public int getTotalBytes() { return totalBytes; }

    public boolean isDone() { return isDone; }

    public void done() { isDone = true; }

    @Override
    public String toString() { return String.valueOf(totalBytes); }
}
