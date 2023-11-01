package com.bal.oop.interfacesdemo.interfacesvsabstract;

public class InterfacesVsAbstractClassesDemo {
    /*different between interfaces and abstract classes

    In the old day days this very clear cut. We could say
    interfaces are purely contact, they have no code implementation and we use them to build loosely coupled, extensible
    testable applications.

    Abstract classes on the other hand are partially (teilweise) implemented classes, and we use them to share code
    between a few classes.

    However, as we have seen with the bad features introduced in Java over the past few years, the meaning of interfaces
    has changed. Now a lot of people are abusing (missbrauchen) interfaces and are using them to achieve inheritance
    multiple inheritance, because in Java a class can be extend ONE CLASS, but it can implement MULTIPLE INTERFACES like
    classes. They put a lot of logic there, and then have another class implement many of them. This is like inheriting
    many code from multiple parents.
    Multiple inheritance brings a lot of complexities and in my opinion it's better to avoid it.

    Start with:
        > brief of history of interfaces and what they are used for.
        > with these new features such a private or static methods, interfaces have lost their meaning, and a lot of
        people are abusing them because they don't understand what interfaces are for. Now if the interviewer happens
        to be one of these people, he will probably get offended > disqualify + reject.
        Good for u. We don't want to work for someone like that who knows very little about OOP and is so arrogant about
        it. A good interview is someone who asks you questions, like why dou u think these features are bad? That is
        where you explain the fact:
            > that people are using this a hack to achieve multiple inheritance, but interfaces should not be confused
            with classes. We should keep them as contracts, so we can minimize the changes, so we can build of loosely
            coupled applications. If change how we do something we are not going to end up with breaking changes or
            recompilation in the code. That is all about interfaces and abstract classes.


    Interface
        > (Contract)
            > have no code or implementation
        > use to build loosely-coupled, extensible, testable applications
    Abstract
        > (partially-completed classes)
        > use them to share code between a few classes

     */
}
