package com.bal.advanced.exceptions.chainingexception;

import com.bal.advanced.exceptions.customexception.InsufficientFundsException;

public class Account {
    private float balance;

    public void deposit(float value) {
        if (value <= 0)
            throw new IllegalArgumentException();
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance)
            throw new AccountException(new InsufficientFundsException());

        //to understanding, how chaining exceptions work
//            var fundsException = new InsufficientFoundsException();
//            var accountException = new AccountException();

        /*
            We are going to say this account accountException was caused by fundsException.

            initCause()
            this method takes a throwable object. So we can pass an instance of the throwable class or any of his
            derivatives (Ableitung).
            And then we throw our account exception.
                accountException.initCause(fundsException);
                throw accountException;
            We have a compilation error:
                throw accountException;
                    > Unhandled exception
                    As signature of this method doesn't specify this exception > it saying
                        > this method will throw an insufficient fundsException. Let's change to
                             public void withdraw(float value) throws AccountException {

            A simple way to write this code
            > got to Account Exception class
            > add the custom constructor, that takes the cause of this exception
            > After if statement (above) use it

            We are throwing an account exception that is caused by an InsufficientFundsException. Technically, we have
            wrapped this object inside a more general exception.
        */

//            accountException.initCause(fundsException);
//            throw accountException;
    }
}
