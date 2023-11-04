package com.bal.advanced.exceptions.handling.throwing;

import java.io.IOException;

public class ThrowingExceptionDemo {
    /*
    IllegalArgumentException
    This is a runtime or unchecked exception, which indicates a programming error. So we shouldn't handle this with a
    try catch  block, we should  come back and fix the source of the problem.

    The java compiler is saying that we haven't handled this exception. This is  where we wrap our code inside a try
    catch block.
     */
    public static void show() {
        var account = new Account();
        try {
            account.deposit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        account.deposit(-1);
    }
}
