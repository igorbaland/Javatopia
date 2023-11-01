package com.bal.oop.interfacesdemo.interfaces;

public class WhatAreInterfaces {
    /*
    Interfaces are one of the most misunderstood features in Java, partly because people don't really know the real
    purpose of interfaces, and also because the meaning of interfaces have changed since Java 8. So we are going to
    walk you through the original and real purpose of interfaces, and then we will look at how this changed over the
    past few years.

    We use interfaces
        > to build loosely-coupled
        > extensible
        > testable
    applications.
    What does this mean?
    Well, earlier we talked about coupling, which is the level of dependency between two software entities like classes.

    class A --> class B
    So if class A uses class B, we say A dependent or coupled to B. Now if we change b, we might have to change the code
    in A, and very other class  that depends on A. Even if you don't have any breaking changes in this code, just
    because B is changed, it has to be recompiled, and that means other class that depends on B, and their dependencies
    should also be recompiled and redeployed.
    Now this is not an issue in a small application with  a few classes, but in a large complex application with
    hundreds of thousands of classes, we don't have want one simple change to cause a lot of cascading, breaking changes
    in several places. We don't want to  change one line and then wait several seconds for hundreds of classes to get
    recompiled.
    So prevent these, we should try to keep the coupling or relationship between our classes as loosely as possible.

    Let me give you an analogy. Think of your car. If there is an internal object in the engine, you only want to
    replace that part. You don't wanna to replace the tires, that makes no sense. This is loose coupling in action.

    How can you reduce the coupling between these two classes?
    Earlier we talked about the abstraction principle of OOP, which says we should hide the implementation details of
    our classes and only expose what is necessary. So by hiding certain members using the private keyword. Class A will
    know less about class B, and this will loosen the relationship between these two classes. But that's not enough. And
    that is where interfaces come to the rescue (Befreiung).

    With an interface we can completely decouple A from B. It knows absolutely nothing  about it. Like it doen't even
    exist. If you change B, A is not being affected.

    What is an interface really?
    An Interface is a type similar to a class, but it only includes
    > method declarations, no implementations > it has no code. It only defines the capabilities (faehigkeiten) that a
    class should have.

    Analogy
    imagine you have a restaurant, you need a chef. You don't care who the chef is as long as they have certain
    capabilities. This is an example of loose coupling. If something happens to your chef or he or she decides not to
    come to work, you can replace them with someone else with the same capabilities.
    Now by contrast, what if the chef  had to be Jon. Then your restaurant is tightly coupled or strongly dependent on
    Jon. If anything happens to Jon, you are in trouble.

    Back to our classes, we don't want class A to be directly dependent or coupled to class B. Because with this, if we
    change B, A might be affected . To minimize the impact of changes you put an interface between these two classes:
    class A         Interface         class B
    and decouple them. Now if you change the code in B, A will not be affected, because it knows nothing about B. This
    is what we call
    > programming against interfaces.
    We code our classes to work with interfaces, not concrete implementation, and with this we can build applications
    that are
    > loosely coupled
    > extensible
    Tomorrow we can easily replace B with another class that implements this interface. This makes it relatively easy
    to extend our applications.
    For example lets say we use B to perform face recognition. Tomorrow  we can replace B with another class like C that
    does a better job at face recognition. It's faster and more accurate, this will not affect the rest of our
    application, we simply replace one class with another one.  As long as both of these classes follow our contract or
    interface everything will continue to work.
    As another analogy, think of your phone. Your phone needs an input for the charger. This input defines an interface.
    You chan use any charger that follows this interface or  contract. As long as the size fits, you can use it to
    charge your phone. If one charger is slow or becomes faulty, you can replace it with another charger.

    So, an interface gives the item what should be done and classes that implement that interface determine how its done

                Interface                               Classes
    What should be done                                 How it should be done
    > data compression
    > Encryption
    > Sorting
    > Searching
    Anywhere we need to have the flexibility to swap how something is done, you can use an interface to make our design
    > loosely coupled-coupled
    > extensible.
    Examples are data compression. Today we will be using one searching algorithm, tomorrow you may want to use a
    different algorithm that is faster and more accurate. You define an interface that says you need to be able to
    search data, then create different classes that implement an interface or contract, each class will use a different
    algorithm for searching data.
    As another example, let's say you building an application for calculating taxes. Each year, tax rules might change.
    But every year you need to be able to calculate the tax. Your interface specifies what should be done, which
    calculate and different classes will provide different ways for calculating the tax. Each year we can solve one
    implementation with another.
    > interface are about > what's
    > classes are about > how is

    So with interfaces we can build applications that are
    > loosely coupled and extensible > They can easily extend or replace various parts with minimal or 0 impact on our
    application.
    > testable > we can also independently test this part and make sure they are working. This is what we call unit
    testing. So this is the real purposes of using interfaces.
     */
}
