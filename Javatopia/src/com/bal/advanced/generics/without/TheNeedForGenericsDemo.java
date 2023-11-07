package com.bal.advanced.generics.without;

public class TheNeedForGenericsDemo {
    /*
    Before we talk about what generics are, let's look at the problem we try to solve.
    Let's say we want to implement a class for storing a list of integer's.
        > create a class call List

    Let's say tomorrow, we want to have a list of users. First we need a user lass.

    The problem
    The list we have created in list lass, we cannot use this lass for storing users, we can only store integers in this
    class. So, we have to create another class called UserList. We have to implement our add and get methods. That is a
    lot of code duplication. What if in the future we want to have a list of Strings? This approach is very tedious and
    not scalable.


     */
    public static void demo() {
        var list = new List();
        list.add(1);
    }
}
