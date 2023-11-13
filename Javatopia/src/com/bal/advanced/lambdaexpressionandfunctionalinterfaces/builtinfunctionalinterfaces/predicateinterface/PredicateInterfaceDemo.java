package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.predicateinterface;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    /*
    Another type of functional interface we have in Java  is the
        > PREDICATE INTERFACE, which is extremely useful. It has tons of applications in the real world. We use it
        interface
            > TO FILTER DATA.
        This interface has a single abstract method called
            > boolean test(T t)
        With this method we can check to see if this object satisfies some criteria. For example, we can give it a
        customer object and check to see if that customer has a balance
            > this is how we use this interface for filtering data.

    Specializations of this interface
         > BiPredicate<T,U>, take types of the two arguments and returns a boolean.
            > boolean test(T t, U u)
         > Primitive
            > IntPredicate, which takes a primitive integer and returns boolean.
            > LongPredicate
            > DoublePredicate

    Let's say we have a string like
        > "sky" and we want to sse if the string has more than five characters.
     */

    public static void show() {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var result = isLongerThan5.test("sky");
    }
}
