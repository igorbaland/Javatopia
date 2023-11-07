package com.bal.advanced.generics.without.poorsolution;

import com.bal.advanced.generics.without.User;

public class DemoMain {
    public static void demo() {
        /*
        Objects, no we can store different types in our array

        This is very bad solution for a couple of reasons.  But before we talk about these reasons, early we talked that
        the object class is the parent of all reference types. We can store any objects in this list.

        Integer is a primitive value.  It's not an object. It's not a reference type. How can we store it here? When we
        compile this code, the java compiler will convert this code to something like
            > Integer.valueOf(1). So we have integer class in java. It is a reference type. It derives from the object
            class and this class has a static method value of which returns a new instance of the integer class. So this
            the reason why we can pass a primitive value to this method. By the same token, we have a
                > wrapper class for every primitive type in Java.

        The problem with this implementation
        The first problem is that if you want to get the first item in this list
            > we call the get method, poorSolutionDemo.getByIndex(0);
            We don't have this as an integer. We may store it in an integer variable called number.
                > int  number = poorSolutionDemo.getByIndex(0);
                We have a compilation error, because this getByIndex method returns an object, but we expect that
                integer. We have to explicitly cast the result  to an integer. And this makes our code a little bit
                verbose and noisy.
        The second problem is that if we use the wrong  type here, we will get an invalid CastException.
            let's change index from 0 to 1
            int  number = (int) poorSolutionDemo.getByIndex(1);
            We know that the second item in this list is a string. What if we accidentally try to cast it to an integer.
            We run our program  > get ClassCastException
                > Problem is here that we will not be aware of bugs like this until we run our applications and test all
                the functions. We can only identify these problems at RUNTIME. It would be great  if we could catch
                these
                problems at compile time. And that's what GENERICS are for.
         */
        var poorSolutionDemo = new PoorSolutionDemo();

        poorSolutionDemo.add(Integer.valueOf(1));
        poorSolutionDemo.add(1);

        poorSolutionDemo.add("1");
        poorSolutionDemo.add(new User());

        poorSolutionDemo.getByIndex(0);
        int  number = (int) poorSolutionDemo.getByIndex(1);
    }
}
