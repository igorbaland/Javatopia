package com.bal.advanced.exceptions.chainingexception;

public class ChainingExceptionDemo {
    /*
    When throwing exceptions, we can use  a technique called
    CHAINING EXCEPTIONS, and that basically means wrapping an exception inside a more general exception. For example,
    look at our withdrawal method. Here we are throwing a new InsufficientFunds exception. But let's imagine withdrawing
    money could fair with different reasons. We could throw different kinds of exceptions. Now we can create another
    custom exception called AccountException, and then we can wrap this exception inside an account exception. This what
    we call Chaining exceptions. It's technique that is used in building libraries and framework quite a lot. We get a
    more general purpose exception, and then we can figure out what caused that exception, in this case InsufficientFund
    exception.

    How this works?
    First, we are going to add more general purpose exception. The detail written information is an Account class in
    withdraw() method

    What we got in stack trace:
    com.bal.advanced.exceptions.chainingexception.AccountException: com.bal.advanced.exceptions.customexception.
            InsufficientFundsException: Insufficient funds in your account.
	    at com.bal.advanced.exceptions.chainingexception.Account.withdraw(Account.java:15)
	    at com.bal.advanced.exceptions.chainingexception.ChainingExceptionDemo.show(ChainingExceptionDemo.java:21)
	    at com.bal.Main.main(Main.java:14)
    Caused by: com.bal.advanced.exceptions.customexception.InsufficientFundsException: Insufficient funds in your
            account.
	... 3 more

    > AccountException
        this exception was thrown withdraw() method
            > caused by different exception
                > InsufficientFundsException

    This chaining exception in action. It's something you may see often, when building large enterprise applications.
    You may see an exception cause another exception, which will cause another exception and so on.
    This exception object has te added
     */
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
//            e.printStackTrace();
        }
    }

}
