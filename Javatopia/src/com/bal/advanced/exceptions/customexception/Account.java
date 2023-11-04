package com.bal.advanced.exceptions.customexception;

import java.io.IOException;

public class Account {
    /*
    Example
    Let's add the method for withdrawing money.
     */
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
    }

    /*
    What kind of the exception, if the value < balance? What if the user has 10$ in their account, but they enter 20$
    to withdraw. This is not a programming mistake. This is an exceptional event that we should anticipate and recover
    from.

    throw new InsufficientFundsException();
    We have a compilation error because we haven't handled this exception. When we are throwing exceptions, we want to
    handle somewhere else. We don't want to handle this exception in this method, it doesn't make sense.
        > alt + enter > add exception to...
     */
    public void withdraw(float value) throws InsufficientFundsException {
        if (value > balance)
            throw new InsufficientFundsException();
    }
}
