package com.bal.advanced.concurrencyandmultithreading.thread.pausing;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading: " + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
