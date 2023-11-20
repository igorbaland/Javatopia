package com.bal.advanced.concurrencyandmultithreading.thread.starting;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        //Here for simplicity let's print a message
        System.out.println("Downloading a file" + Thread.currentThread().getName());
    }
}
