package com.bal.advanced.exceptions.customexception;

public class CustomExceptionDemo {
    /*
    Java provide a lot of general exception classes that we can use in our application. But sometimes we need to create
    custom exceptions that are specific to our application domain. That is particularly useful if you are building
    library or a framework for others to use.
    CUSTOM EXCEPTIONS helps users and other developers better understand intent and the actual problem.


     */
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
