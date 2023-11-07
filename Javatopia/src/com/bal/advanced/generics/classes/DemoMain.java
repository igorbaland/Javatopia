package com.bal.advanced.generics.classes;

import com.bal.advanced.generics.without.User;

public class DemoMain {
    public static void demo() {
        /*
        in angled brackets we can specify the type of objects we want to store in this list. Foe example user or String
        and so on.

        Let us create  a generic list of integer and call the Add method.

        The type of add method becomes an integer
            new GenericList<Integer>().add("a");
            we cannot pass a string, we get a CompileTimeError

        > this is the benefit of generics. This generics class ensures that every object in this list is an
                integer.
        Now, let's store this in a variable

        > the second benefit, if we call the get method, we get an integer. We can simply store it in an integer. And
        we don't need an explicit cast.
            > int number = list.get(0);

        If you had a generic list of users, we could add a user object here, we don't need an explicit cast.

        So our codes becomes cleaner, and we get compile  time type safety. We can catch our mistakes at compile time,
        rather than at runtime.  That is the beauty of generics. We are going to study generics in more details. We are
        going to understand, how exactly generics work under the hood.
         */

        var list = new GenericList<User>();
        list.add(new User());
        User user = list.get(0);

//        var list = new GenericList<Integer>();
//        list.add(1);
//        int number = list.get(0);
    }
}
