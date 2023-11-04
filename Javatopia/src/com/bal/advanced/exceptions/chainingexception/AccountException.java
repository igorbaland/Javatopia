package com.bal.advanced.exceptions.chainingexception;

public class AccountException extends Exception {
    public AccountException(Exception cause) {
        super(cause);
    }
}
