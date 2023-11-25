package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.implemeningasynchronous;

public class ImplementingAsynchronousAPIDemo {
    /*
    Create an asynchronous API. This is very powerful technique that we should start using application right away. In
    This project, We are going to add a new class MailService. We are going use this class to send emails to our users.

    If we print another message like "hello world", we are not going to see this until
        service.send() returns.
            Run
                We are waiting for the mail to be sent.
                    Three seconds later,
                        The mail is sent
                        And we see the Hello World message
    This is the problem with synchronous or blocking code. Anytime we have a long-running operation, like querying a
    database, calling a remote service, working with file system. We should run these operations asynchronously.

    How to do that?
    In our MailService class, we are going to reimplement this method in an asynchronous fashion.

    So here we call sendAsync()
        service.sendAsync();

        Because this is an asynchronous method, it's not going to block the current thread. The moment we run this
        program, we are going to see  this "hello world" message immediately. Then we wait three seconds for the mail to
        be sent.
        But what is happening to our email?
            Well here have a command line program. And this program terminated so quickly that we didn't see the result
            of tas that was executed on a separated thread. We don't have this problem in a mobile or desktop app,
            because these apps are continuously running until the user terminates them. To prove to us that our mail
            was being sent on a separate thread, we are going to put a delay over here
                Thread.sleep(5000);
            Now we are running our program, three second later we see
                mail was sent.

    this is the benefit of asynchronous API's. They don't block current thread and allow us to better exploit our
    parallel hardware.
     */

    public void show() {
        var service =  new MailService();
        service.sendAsync();
        System.out.println("Hello World");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
