package com.bal.oop.thefourthprincipal.polymorphism.abstractclassesandmethods.finalclassesmethods;

public class FinalClassesMethodsDemo {
    /*
    so we learned that when we declare a class as the abstract you cannot instantiate it, you can only extend it.
    In contrast we have final classes. When we declare a class as final
    > we cannot extend it anymore

    > where we use final classes?
    We use final classes in situations where we are 100% sure of the implementation of the class and we want to prevent
    other classes from extending that class.

    This is something that often?
    To be honest, no, and you shouldn't really use final classes that often, because it prevents us form using
    inheritance and polymorphism and many other powerful object-oriented features.

    But there are situations where  the implementation of the class is specific, we have made so many assumptions in
    that implementation, especially about changing the state. In this cases, we can declare our classes as final and
    this will prevent other classes from extending that class.
    An example of that in java is the String class. So we cannot extend the String class because it's declared as final.
    You might be wondering why. Because strings are immutable. So once we create an initialize  a string, we cannot
    change it's context. if we call any of it's method, like two suppercase or two lowercase, we will get a new string.
    So this is the assumption that is made in the implementation of this class. People who have implemented the string
    class have made sure that every method that modifies a string object will in fact return a new instance. That is the
    reason why they have declared this class as final. So we wouldn't accidentally extend this class and wreck this
    assumption, so this is aal about final classes.

    Final methods
    In java we also have final methods, when we declare a method as final, we can not override it.
    Example > in UI control
     */
}
