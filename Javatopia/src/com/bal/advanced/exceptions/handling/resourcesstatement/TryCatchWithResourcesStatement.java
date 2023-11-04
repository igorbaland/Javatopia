package com.bal.advanced.exceptions.handling.resourcesstatement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchWithResourcesStatement {
    /*
    A better way to release external resources like file handles and database connections. In Java, we can declare and
    initialize our external resources as part of the try statement.
    After keyword try, we type a pair of parentheses. And inside this parenthesis, we create and initialize
    > external resources.
        > try (var reader = new FileReader("file.txt")) {
        This is what we call the try with resources statement. A try statement that has one or more resources. With this
        structure, we don't need to explicitly close this resource inside the final block, the java compiler will do
        that for us. When we compile this code, the java compiler will translate this code to what we had at the
        FinalBlockDemo.class, it will add a final block and explicitly close the reader object. For this work, this
        class should implement the auto closable.
    Documentation > Class FileReader
                    All Implemented Interfaces:
                        Closeable, AutoCloseable, Readable
    One of them is  > AutoCloseable. This interface declares methods called close(). The close method that we have in
    the FileReader actually come from here. The objects that we created, should implement the AutoCloSable interface.
    Now we can create multiple objects.
     */

    public static void demo() {
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...")
        ) {
            var value = reader.read();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
