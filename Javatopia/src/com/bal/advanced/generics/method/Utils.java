package com.bal.advanced.generics.method;

public class Utils {
    /*
    This class is going to have a bunch of utility(dienstprogramme) methods. Let's say we want to get a maximum  of two
    values.

    Static utils
    We add a public method. We make it static, we don't have to create an instance of the utils class. This is
        > common convention for declaring utility methods. We make them static.
    We can use the ternary operator
        public static <T> int max(int first, int second) {
        return (first > second) ? first : second;
    }

    We want to make this method generic. Instead of getting two integer and returning an integer, we want to be able to
    work with different types of objects. We don't necessarily have to make this class generic. We can declare a generic
    method inside a non-generic classes. Example
        public static <T> int max(int first, int second) {
    Now we replace all the integers with T. We have a compilation error, because we can not apply the comparison
    operator between objects of type T, we can only apply two numbers and characters.
    How can we compare these two objects?
    We talk about the comparable interface in the last section. Here we can tell the java compiler that this <T> is an
    object that implements the comparable interface.
    How we can do that?
    We type extends comparable of T
        public static <T extends <T>> T max(T first, T second) {
    we are applying a constraint.

    This is one application of the compared to method

     */

    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }

}
