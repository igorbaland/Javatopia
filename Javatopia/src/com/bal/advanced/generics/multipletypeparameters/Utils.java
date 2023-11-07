package com.bal.advanced.generics.multipletypeparameters;

public class Utils {
    /*
    In this example, we are restricted to managers for keys and values. What if we want to pass a string as the key,
    this is not a  flexible implementation. Just before the return type, we add a type Parameter and replace int with
    that is better
        >  public static <T> void print(T key, int value) {

    But again, we have a restriction here, our values have to be integers. This is where we need multiple type
    parameters. So we need to declare a second type parameter. When we have two type parameters, we call them
        > <K, V>  ---> <Key, Value>   ---> this is the common convention
    But again, we can use whatever we want. Now we replace
         public static <K, V> void print(K key, V value) {
     */

    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? first : second;
    }
}
