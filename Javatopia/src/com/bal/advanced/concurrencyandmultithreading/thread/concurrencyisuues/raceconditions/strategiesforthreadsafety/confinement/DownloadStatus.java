package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.confinement;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
    }

//    @Override
//    public String toString() {
//        return String.valueOf(totalBytes);
//    }
}
