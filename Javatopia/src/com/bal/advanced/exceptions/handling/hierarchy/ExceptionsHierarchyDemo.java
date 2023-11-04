package com.bal.advanced.exceptions.handling.hierarchy;

public class ExceptionsHierarchyDemo {
    /*
        Let's look at the classes that represent different types of exceptions. At the top of exceptions hierarchy, we
        have the
                                                THROWABLE
        which defines the common characteristics for all exceptions and errors like an error message and the stacktrace.
        So every king of exception or error has an
        > error message
        > stacktrace
        Below this class, we have two classes
                                EXCEPTION                   ERROR
                                (checked)

        The ERROR class and all it's subtypes represents error that are external to our application, like
        OutOfTheMemoryError.

        The EXCEPTION class is the parent  for all CHECKED and UNCHECKED exceptions.

        Belong the EXCEPTION, we have
                                RUNTIME EXCEPTION
                                (unchecked)
        which represents runtime or unchecked exceptions. So if an exception class derives from the runtime Exception,
        it's considered an unchecked exception. Otherwise, it's checked exception.
        This is a bit weird, because when we think that any classes that derived from the exception class is a checked
        exceptions, so runtime exception should also be checked exception, but that is not how it works.

        Parent classes for creating customize exceptions > extends
        EXCEPTION > checked
        RUNTIME EXCEPTION  > unchecked

        Let's quickly explore this hierarchy in java documentation. We search in google for Java NullPointerException
            original documentation > https://docs.oracle.com/ ...
       Look at the exception hierarchy.

            java.lang.Object
                java.lang.Throwable
                    java.lang.Exception
                        java.lang.RuntimeException
                            java.lang.NullPointerException

        Here we have the NullPointerException. This class derives from the runtime exception, which derives from the
        exception class, which in turn derives from the throwable. As you can see, the object class is the parent of
        all classes in java. If you are curious what other runtime exceptions we have, you can click

        > java.lang.RuntimeException > under > Direct Known Subclasses, we can see all types of runtime exceptions. We
        don't really need to learn about each of these individually. You will get know them as you build Java
        applications. Some of them may never occur to you. So don't worry about learning all types of exceptions in
        Java.




     */

}
