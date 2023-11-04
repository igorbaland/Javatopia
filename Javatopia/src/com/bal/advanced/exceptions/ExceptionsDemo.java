package com.bal.advanced.exceptions;

public class ExceptionsDemo {
    /*
    All applications can encounter errors when they run. In Java errors are represented with
    > EXCEPTIONS.
    In this section we are going to learn all about exceptions and how to handle them to built robust applications. We
    will be talking about:
    > EXCEPTION OBJECTS and how they work
    > DIFFERENT TYPES OF EXCEPTIONS
    > different techniques for HANDLING EXCEPTIONS
    > CUSTOM EXCEPTION
    > CHAINING EXCEPTIONS

     */

    /*
    Made it static, so we can call it easily from the main method without having to create an object
     */
    public static void show() {
        /*
        What are exceptions

        Our program is going crash.  so our program crashed, without an exception or an exceptional event. And
        the
        > type of this exception is the NullPointerException. This is the root cause of many problems in Java programs.
        This NullPointerException is a class that is declared in this package > JAVA.LANG.
            > Exception in thread "main" java.lang.NullPointerException

        An EXCEPTION is > an OBJECT, that contains information about error. In this case, this object is an instance of
        the NullPointerException class. But we have SEVERAL EXCEPTION CLASSES in Java. We will learn about them as we go
        through the section.
        Now, let's see where this exception occur in our program. We got this exception in the sayHello method on line *
        of this file.
            > at com.bal.advanced.exceptions.ExceptionsDemo.sayHello(ExceptionsDemo.java:29)

        If we click, we can go to the offending line. This happened when we try to call the toUpperCase
        method on null. That is why we got a NullPointerException.

        How did we get there?
        We got there from the show() method
            > at com.bal.advanced.exceptions.ExceptionsDemo.show(ExceptionsDemo.java:25)

        How did we get to the show() method?
        We got here from the main() method
            > at com.bal.Main.main(Main.java:8)

                    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()"
                    because "name" is null
                at com.bal.advanced.exceptions.ExceptionsDemo.sayHello(ExceptionsDemo.java:29)
                at com.bal.advanced.exceptions.ExceptionsDemo.show(ExceptionsDemo.java:25)
                at com.bal.Main.main(Main.java:8)

	    This information that we have here is called the
	    > STACK TRACE
	    It shows the methods that have been called in the reverse (umkehrenden) order. And this is very useful when
	    troubleshooting problems. We can see exactly how we got to the offending code.


	    When an exception occurs in method, we say that methods:
	    > throw an exception. Just like a person can throw a ball and method can throw an exception.
	    When this happens, the Java Runtime looks for block of code in that method for handling that exception. We refer
	    to that:
	    > an Exception Handler.
	    In this implementation, we don't have any exception handling code.  So the JAVA RUNTIME looks for an EXCEPTION
	    HANDLER in this method. If it doesn't find it, it goes the PREVIOUS METHOD. Again, we don't have any exception
	    code here. So the JAVA RUNTIME goes back to the main method, hoping to find an exception handler. We don't have
	    one here. So that is why Java Runtime terminates our program and displays the exception. Now, as a good Java
	    Developer, you should prevent such exceptions from happening or anticipate and handle them properly. And that's
	    what are you going to learn in this section.

         */
        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
