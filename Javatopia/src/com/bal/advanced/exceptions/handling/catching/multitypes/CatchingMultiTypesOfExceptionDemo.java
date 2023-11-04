package com.bal.advanced.exceptions.handling.catching.multitypes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CatchingMultiTypesOfExceptionDemo {
    /*
    Sometimes we need to catch multiple types of exceptions.

    For example, After reading a file, let's call reader and store in  a variable called value
        var value = reader.read()
    Here we have another compilation error because we haven't handled the IO Exception. This read may throw an
    IOException, if it cannot read data from this file. To solve this problem, we need to add another one catch clause:
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            System.out.println("Could not read data.");
        }
    The exception is gone. Now we have
    MULTIPLE  CATCH BLOCKS, and each catch block targets a specific type of exception. Only one of these will be
    executed.In this case, we try to open File that doesn't exist > so this line will throw
        > new FileReader() > File not Found
            > catch (FileNotFoundException e)
            e.getMessage()
    After that, the control will move out of the try catch block. The second catch block will get ignored.

    We have multiple catch blocks and each catch block targets a specific type of exception.

    Does the order of this catch blocks matter?
    Sometimes it does. If I move IOException catch block over FileNotFoundException we see
        > a compilation error. The Java compiler is saying  that we have already caught the FileNotFoundException
    What does it mean?
    Let's look at the documentation for the FileNotFoundException
    java.lang.Object
        java.lang.Throwable
            java.lang.Exception
                java.io.IOException
                    java.io.FileNotFoundException
       FileNotFoundException extends IOException. And that means, if you have  a parent class extends it in subclass, we
       don't need this FileNotFoundException. This is the polymorphism principle of OOP. If I have a variable
       of IOException, let's call it X, I can set this variable to a new instance of our exception or any classes that
       extends  IOException class.
                    IOException x = new FileNotFoundException();
                    This is polymorphism. An object may take different forms.
       So if you have a catch class to catch an IOException, this can catch on IOException or any of it's derivatives
       (abgeleitende). Any classes that extend the IOException class.

     Sometimes we want to treat this exceptions the same way. For example, we can display it generic errors message,
     but other  times we want to handle them differently. If we get a FileNotFoundException, we can print a message
     like: sout: File does not exist.
     So we are giving the user a more specific message.

      Another example
      Let us create a new simple date format object. Here we have another  compilation error, because this parse
      method may throw an exception of type ParseException. Now we can put the category here, press
      > alt + enter
      > add catch clause

       Let's say we want to treat all of these the same way.
    > IOException | ParseException e
    > with this we don't  need the second catch clause. This block can catch exceptions or parse exception.

    So these are different ways to catch  multiple exceptions. The approach you take a really depends on your
    application and it's  requirements.

     */

    public static void demo() {
        try {
            var reader = new FileReader("text.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (IOException | ParseException e) {
            System.out.println("Could not read data");
        }
//        catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
    }
}
