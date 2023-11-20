package com.bal.advanced.concurrencyandmultithreading.thread.concurrencyisuues.raceconditions.strategiesforthreadsafety.adders;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading: " + Thread.currentThread().getName());

        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        System.out.println("Download completed: " + Thread.currentThread().getName());
    }
}
