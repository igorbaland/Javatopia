package com.bal.advanced.exceptions.handling.rethrowing;

import java.io.IOException;

public class ReThrowingExceptions {
    /*
    In this program, we are depositing a negative value in our account. We catch an IOException and then print the stack
    trace. So when we run our program, we see the stack trace. In real applications when we catch those exceptions, we
    want to log them somewhere. We want to store them in a file or in a database. Sometime in the future, we can come
    back and see what errors we had in our application. Let's simulate logging by printing a message on the terminal.
    Instead of printing the stack trace, we are going to print logging. When we run our program, we see the logging
    message. But something is missing. We are not telling the user that an error occurred. Let's imagine, the user tries
    to deposit a negative value, click the deposit button but nothing happens. Application is not crashing, it is not
    displaying an error  either. The reason this is happening because we are catching this exception in
        } catch (IOException e) {
    We handled it and then the application will continue the normal execution. So in situations like this, we should
    really  throw that exception. Somewhere else in application, we can get it and display generic error message. In
    this catch block, we type
        throw e;
    We are
        > re-throwing this exception object. Now we have a compilation error. The java compiler is saying that we
        haven't handled the IOException. In this case, we don't want to wrap this inside a try catch block, because
        when we throw  an exception, we  the caller of this code to handle it. To fix it problem , we specify this
        exception in the declaration of this method
            public static void show () throws IOException {
            with IntelliJ> cursor in object > alt + enter > add exception to method signature
    In our main method we need to catch this exception
        public static void main(String[] args) {
        try {
            ReThrowingExceptions.show();
        } catch (IOException e) {
           System.out.println("An unexpected error occurred.");
           ____
           and this is where we can print a generic error
        }
    }
    Output: Logging.
            An unexpected error occurred.

    Like desktops or mobile applications

     */
    public static void show () throws IOException {
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging.");
            throw e;
        }
    }
}
