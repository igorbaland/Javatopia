package com.bal.advanced.generics.method;

public class GenericMethodsDemo {
    /*
    We have learned how to create generic classes. In this generic class we have a couple of generic methods
    > add
    > get
    continue in Utils.class

    Now let us test this Utils.max();
    Look at the type of this parameter is T. Because at this point, the java compile doesn't know if you are going to
    pass an integer, a character, a string, a user object or what...
    The moment we pass a value there, let's say one. The java compiler knows this is an Integer. It wraps it inside the
    Integer class. We didn't know that the second parameter should also be an integer.  I cannot pass the next parameter
    a character or a string there. This is the benefit of using generics. Instead of adding two parameters of type
    object, we use a generic method.


     */
    public static void demo() {
        var maxUser = Utils.max(new User(10), new User(20));
//       var max = Utils.max(1, 3);
        System.out.println(maxUser);
    }
}
