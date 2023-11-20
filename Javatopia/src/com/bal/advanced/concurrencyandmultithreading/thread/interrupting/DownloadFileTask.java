package com.bal.advanced.concurrencyandmultithreading.thread.interrupting;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading: " + Thread.currentThread().getName());
        for(var i = 0; i < Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) break;
                //return;
            System.out.println("Downloading byte " + i);
        }

        System.out.println("Download completed: " + Thread.currentThread().getName());
    }
}
