package com.bal.advanced.exceptions.handling.types;

public class TypesOfExceptions {
    /*
    A lot of people new to Java find this confusing. So let's make it super  simple for u.
    In Java we have 3 types of Exceptions:
    > CHECK
        are exceptions that we developer should ANTICIPATE and HANDLE PROPERLY. For example, let's say we want to read
        data from a file. What if the file doesn't exist? Maybe it got deleted just before we tried to open it for
        reading. Good developers always ANTICIPATE and HANDLE these edge cases. So instead of letting (statt zu lassen)
        the runtime terminate our program, we would be better display a friendly message to the user and saying: hey,
        that file doesn't exist. Now, the good news is that the JAVA COMPILER ENFORCES us to handle these errors. That
        is why they are called
        > check exception. Because  they get checked at compile time (weil sie zu Kompilierzeit überprüft werden).

    > UNCHECK also called RUNTIME EXCEPTIONS
        As the name implies, these exception are not checked by the compiler at compile time. they occur because of
        programming errors. NullPointerException is an example of a runtime  exception. In the last course, we shouldn't
        have passed null to the sayHelloMethod (ExceptionDemo.java). This is a programming error. So unlike checked
        exceptions, we don't want to anticipate and recover by displaying a friendly message like: hey, we made a
        mistake and try to use an object reference with  the null value. Doesn't make sense, we should prevent
        exceptions like this from happening in the first place. How can we do that?
        > by good coding practices and testing, a lot of testing, preferably AUTOMATED TESTING.
        Other examples of Runtime Exceptions are:
            > Arithmetic exception
                > gets thrown if you try to divide  value by zero
            > IllegalArgumentException
                > indicate that the argument we passed to a method was not accepted. Again, this is programming mistake
                that a kind of error that we should anticipate and validate.
            > IndexOutOfBoundsException
                > which occurs if we try to access an element in an array or a string, or list using an invalid index.
                For example, we have five elements in an array, but we try to access the 10th element.
            > IllegalStateException
                which get thrown if we tried to call method, but the underlying object is not in the right state.

    > ERRORS
        which indicates an error external to our application, StackOverflowError or OutOfMemoryError, there is nothing
        we can do about it. So just like RuntimeExceptions, we should let the application crash, rather that display a
        friendly message to the user. We should try to identify the source of these errors. These errors can happen
        because of programming errors, like an infinite recursion, or for reasons outside of our application, like
        problem  in the JVM itself.

     */
    /*
    check exception
     */
    public static void show() {
        /*
        Let's create a new file reader for reading data from a file. Look at this red underline
            var reader = new FileReader("file.txt");
        The Java compiler knows that the constructor of the file reader will throw an exception if the file doesn't
        exist. It is telling  us: hey, you haven't handled this exception
        > FileNotFoundException
        This is an example of a CHECKED EXCEPTION.
        Check exceptions are exceptions that we should ANTICIPATE and RECOVER from, and that is why they are called
        checked exceptions. Because the Java Compiler checks them at compile time.

                                    Zeitpunkte
                    Vorhanden                                 Lesen
                                    in der Zwischenzeit
                                    wird gelöscht
         */
        //choose declaration > ctrl + mouseclick on instance
//        var reader = new FileReader("file.txt");
    }

}
