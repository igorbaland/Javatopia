package com.bal.advanced.generics.primitivetypes;

public class GenericsAndPrimitiveTypesDemo {
    /*
    When creating an instance of a generic type, we can only use a reference type as a generic type argument.

    I'm going to create  a generic list of user, we can pass the User class as generic type argument, because this class
    is a reference type. we can also use the object and string class... There are all references types in Java, but here
    we cannot pass
        > the primitive types. Short, int, boolean or float...
        new GenericList<float>();
    If you want to store these primitive values inside a generic list, we have to use the wrapper class. So every
    primitive type in java has a wrapper class.

    The wrapper classes for primitive type's
        int -> Integer
        float -> Float
        boolean -> Boolean and so on...
    That is a reference type that stores at Boolean, if you want to create a generic list of integers, you have to write
    code like this:
        >  new GenericList<Integer>();
    Let's store this object in a variable of integer
    GenericList<Integer> numbers = new GenericList<Integer>();
                                                this Integer is grayed out, because it's unnecessary, we are duplicating
                                                our code.
           GenericList<Integer> numbers = new GenericList<>();
    Look at the signature of the art method. It takes an instance of the integer class.
        numbers.add();
    But we can pass a primitive integer, like 1
        numbers.add(1);
    And the Java compiler will automatically wrap this value inside an instance of the integer class. It is going to
    create an instance of the class to store this value.  This process is called
        > BOXING. The Java compiler is going to put this primitive value inside a box. When we call the get method
            > numbers.get(0); > look at the return type > we get an instance of the integer class.
    >  int number = numbers.get(0);
    In this case the Java compiler is going to extract the value that is stored in that integer object.
        > this is called UNBOXING
            >  int number = numbers.get(0);
        (> BOXING
            >    numbers.add(1);)
    This is how we can create generic types that work with primitive values

    */

    public static void demo() {
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); //BOXING
        int number = numbers.get(0);    //UNBOXING
    }
}
