package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.waitingfommanytasks.waitingforthefirsttaks;

public class LongTask {
    public static void simulate() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
