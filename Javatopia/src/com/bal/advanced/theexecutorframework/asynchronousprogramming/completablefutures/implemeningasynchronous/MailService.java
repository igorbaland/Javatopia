package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.implemeningasynchronous;

import java.util.concurrent.CompletableFuture;

public class MailService {
    /*
    In real application we should pass an EmailMessage object, but let's not worry about that. Instead, we're just going
    to print a message. Sending an is a long running operation, because we have to go over the network. Basically,
    anytime we have to touch the file system or the network. we are dealing with a long running operation. And we
    shouldn't run these operations on the main thread, we should run them on a separate thread.
    To simulate  a long-running operation, we want to use our
        LongTask class, that did be created in the last section. Here we call the simulate thread.sleep(3000);

    Asynchronous method
    Instead of returning void , we are going to return
        CompletableFuture<Void>
            This method returned an Integer, here we would use CompletableFuture of Integer. Now we call this method
            sendAsync. By convention, we add the Async suffix to this method. Here we should return a CompletableFuture
            object.
                return CompletableFuture
                    Because we are not returning a value, we should call
                        CompletableFuture.runAsync()
                            Here we should pass a runnable object. So we can use the lambda expression and in the body
                            of this lambda we simply call synchronous method
                                return CompletableFuture.runAsync(() -> send());
    With this single line of code, we can execute  this method in an asynchronous fashion, because when we call the
    runAsync method, the tasks that we pass here is going to be executed on a separate thread on the common thread pool.
    If we have an existing synchronous method, we can simply convert it to asynchronous method by wrapping in inside a
    completableFuture object.
     */
    public void send() {
        LongTask.simulate();
        System.out.println("Mail was sent.");
    }

    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(() -> send());
    }
}
