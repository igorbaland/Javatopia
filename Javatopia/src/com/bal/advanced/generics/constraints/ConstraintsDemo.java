package com.bal.advanced.generics.constraints;

public class ConstraintsDemo {
    /*
    There are attempts we want to add a constraint or  a restriction on a type parameter.
    For example, let's say we only want to store numbers in this list. Perhaps this list is going to support some
    operations that only makes sense for numbers. To do that  we type
        > extends numbers in our GenericList class
            > can only be use a numbers
            public class GenericList <T extends Number> {
            }
    Now, our T can only be a number of a class or any it child classes.

    But what is this number class?
    If you search for Java number class (Java SE 8)
    You can see that the number of classes declared in Java that lang package, and it is the base class for these
    classes: byte, double, int and so on... All this wrapper classes around numeric primitive types derive from the
    number class. With this constraint, if we create a new list of String, we get a compilation error
        new GenericList<String>();
    because the string is not a number. Here we can only pass the Number class or any that derives from the number, like
    integer, float and so on. Also, this constraint doesn't have to be a class it can also be an
        > interface
    For example, in Java we have a popular interface for implementing classes that can be
        > COMPARABLE
        we use it interface for implementing classes that can be compared with  each other. For example, if we implement
        this interface in our user class, we can compare to user objects based on some criteria, like their last login
        date, then we can sort all users based on their last login date. We will look at the comparable interface later
        in this section

        public class GenericList <T extends Comparable> {
        }

    Applying constraint works
    We are saying that this list can only store objects that are comparable.
    We can pass short, string... but not we can not pass user because our user class does not have implementation the
    comparable interface. We must implement in User class comparable interface. Now, the error is gone.

    CLONEABLE interface
    This is another popular interface in Java. If we want to be able to clone or copy a class, we should implement this
    interface in that class.
        public class GenericList <T extends Comparable & Cloneable> {
        }

        public class User implements
                                    Comparable, Cloneable{
        }

            public static void demo() {
                new GenericList<User>();
            }

    Now we were saying that this genericList can only store objects that are comparable and cloneable. Note, that here
    we have a single ampersand (&) > this is not logical AND operator. We can only pass classes that implement both
        the comparable and cloneable interfaces.
            user implements cloneable, comparable

    This is all about applying CONSTRAINTS. With this constraint, we say that we have bounded T (type) parameter.
        > T is bounded
        > T is restricted
    */

    public static void demo() {
        new GenericList<User>();
    }
}
