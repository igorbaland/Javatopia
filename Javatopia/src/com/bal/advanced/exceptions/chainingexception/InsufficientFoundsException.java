package com.bal.advanced.exceptions.chainingexception;

public class InsufficientFoundsException extends Exception{
    public InsufficientFoundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFoundsException(String message) {
        super(message);
    }
}
