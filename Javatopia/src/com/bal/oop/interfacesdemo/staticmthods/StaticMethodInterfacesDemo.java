package com.bal.oop.interfacesdemo.staticmthods;

public interface StaticMethodInterfacesDemo {
    /*
    Another bad feature introduced in Java over the recent years is the ability to define
    > static methods in our interfaces. Here we can define like below

    What is wrong with this?
    Well, if we have been paying attention to everything we have been talking about, we should know the answer. The
    problem it this interface have implementation. It has code. It has logic. This logic can change the future. Now here
    we are dealing with a very simple logic that will probably never change. But I have seen people adding several
    methods to an interface, each ten lines or more. Unbelievable, these people don't really understand what interfaces
    are for. Once again, interfaces are about
    > what is and not how is!
    Here we are dealing with how something is done or calculated. Now a common argument that what if we need to reuse
    this logic across all classes that implement this interface. Well, that is when you define an
    > ABSTRACT CLASS and move this logic there. It's can be shared by all it's children.

    Avoid static methods in interfaces, whenever we are defining logic. We are dealing with > how is. How is > don't
    belong to interfaces. They belong to classes.
     */
//    static double getTaxableIncome(double income, double expenses) {
//        return income - expenses;
//    }
}
