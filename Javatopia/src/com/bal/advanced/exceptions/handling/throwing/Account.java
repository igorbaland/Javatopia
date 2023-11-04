package com.bal.advanced.exceptions.handling.throwing;

import java.io.IOException;

public class Account {

    /*
    An exception object. We are telling the caller of this method that we have passed an IllegalArgument

    This is how we can throw an exception in Java.

    This technique that we have used here, validating this argument and throw an exception is called
    > DEFENSIVE PROGRAMMING
    If a negative value can cause a serious problems down the road, we throw an exception and prevent the rest of our
    code from getting executed. This is why this technique is called  defensive programming because we are coding in a
    defensive manner. Our code is immediately telling, that it cannot work with a negative value. This is better than
    letting this negative value get some serious problem down the road.
    Adding this validation  logic and throw an exception, it makes our code a bit longer and more verbose. This is very
    simple example. But what if we had a method with three parameters. With this approach, the first six lines of this
    method would just be data validation logic.

    So I would say it's better to use defensive programming if you are building a
    > library or a framework for other to use. If you are building an application, you should have a level of trust in
    your code, your methods to trust each other. Don't pollute every single method with data validation logic. Perform
    this kind of validation only when you receive input from the
    > user or external systems. At the boundary of your application, but not within the application itself.
    Here we are throwing a runtime or unchecked exception. But what if we want to throw a checked exception? I'm going
    to replace this
        throw new IllegalArgumentException() with  IOException
    Now we have a compilation error: > unhandled exception: java.io.IOException
    The Java compiler is saying we haven't handled this exception. Should we wrap this in a try catch block? No, it
    doesn't make sense to throw this exception and handle it right here. We want to throw this exception in this method,
    and have the caller of this method - handle this exception. Just like how we use the file reader class. The
    FileReader class throws an exception that we have to explicitly handle. To get rid of this compilation in the
    declaration of this method , we should specify that this method may throw an IOException. Note, that is this
    > throws but there we are using throw keyword
        >  public void deposit(float value) throws IOException {
    We are basically telling the caller of this method that this method may throw an IOException. This is the part API
    of this method. API is short application programming interface. Anyone, who wants to use our account class, should
    know that the deposit method takes a float and may throw exception. These details represent the interface or the API
    method. Now, we must go to caller of this method.
     */
    public void deposit(float value) throws IOException{
        if (value <= 0)
//            throw new IllegalArgumentException();
            throw new IOException();
    }
}
