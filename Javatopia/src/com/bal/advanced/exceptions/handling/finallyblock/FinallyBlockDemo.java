package com.bal.advanced.exceptions.handling.finallyblock;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlockDemo {
    /*
    Let's imagine this file.txt exists. We successfully open it for reading, but something goes wrong, when we try to
    read data from this file. This can happen because of a hardware problem. Now we have a problem with below code. The
    problem is that we have opened file for reading, but nowhere we have closed it. File handles our operating system
    resources. Whenever we get them, we should always release them, otherwise, other processes may not be able to access
    these resources. Somewhere in this code, we  should close the reader.
        > var reader = new FileReader("file.txt");
        > var value =  reader.read();
        > reader.close();
    if we add a function close in try block, we will have a problem with this implementation.
    The problem is that if this line throws an exception, the runtime will pass the control of this catch block. So this
    line will  never get executed.
    What if we put this line after  try catch block.
        >  } catch (IOException e) {
            System.out.println("Could not read data.");
        }
            >>> reader.close();
    Now the reader  variable is not recognized because we have declared
    it inside this try block. it is only accessible in this block.
    The problem with this implementation is that sometime in the future, another developer might come here and write
    some extra code and this code may throw exception. Our reader is not going to get closed. The proper way to handle
    these kind of scenarios is to use the
        > FINALLY BLOCK

    Right after the catch block, we type finally.  In this block, we can release external  resources like file handles,
    database connections and so on. There we should type reader.close();. But once again, reader is not recognized
    because  it's only accessible at a try block.
    To solve this problem, we need to declare it before our try block.
    (By the way, we can only use var to a new instance of a class. The compiler knows  that this object is an instance
    of the fileReader. In this case we are not initializing this variable. The compiler doesn't know what is the type of
    this variable.)
    Now, we have a compilation error, variable reader might not have been initialized. Because in Java, before we can
    access an object, we should always initialize it. If this line
        > reader = new FileReader("file.txt");
    doesn't get executed (if it throws an exception), we will try to use an uninitialized object. To solve this problem,
    we need to explicitly set this to       > null. The compilation error is gone. Now we have a different kind of
    error.
    But first let's add an if statement. We want to call the close method, only if the reader is not null > close it.

    What is this compilation error      > on handle exception : IOException. The closed method may also throw an
    IOException. To solve this problem we need to wrap this inside a try catch block.
    Alt (linkte) + enter
        > FINAL BLOCK will get always executed. Whether we have an EXCEPTION or NOT! If we don't have an exception, all
        the code inside the TRY will get executed and then the runtime will pass control to the FINAL BLOCK.
        If one of the try block throws an exception, one of our catch block will get executed + FINAL BLOCK.

    The final block will always get executed no matter what. This implementation is really ugly. In the next section
    I'm going show u a better way to release external resources.


     */
    public static void demo() {
        FileReader reader = null;

        try {
            reader = new FileReader("file.txt");
            var value =  reader.read();
        }
        catch (IOException e) {
            System.out.println("Could not read data.");
        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
