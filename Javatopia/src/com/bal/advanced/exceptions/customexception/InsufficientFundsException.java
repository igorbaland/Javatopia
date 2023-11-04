package com.bal.advanced.exceptions.customexception;

public class InsufficientFundsException extends Exception {
    /*
    The naming convention
    We always use the exception suffix to the name our exceptions classes. This is the same convention that is used in
    Java.

    We need to decide if this is going to be a checked or uncheck
    > check extends Exception
    > uncheck extends RuntimeException

    If you don't supply a message, this message will be used, otherwise the custom message that we provide will be used.
     */

    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
