package com.bal.oop.interfacesdemo.privatemethods;

public interface PrivateMethodsDemo {
    /*
    Another awful feature introduced in Java 9, is the ability to implement private methods in an interfaces. This is
    probably the worst thing that has ever happened to Java.

    What are private methods?
    They are implementation  detail. Why should be allowed in interfaces? No idea. Here is what some people say about
    why we need this feature. As part of
    > writing the static methods, which we shouldn't write in the first place. We might end up with some repetitive
    logic.
    We can refactor our code, and extract that redundant logic into a private method inside an interface. That is why
    this feature has been requested and added to interfaces, terrible.
    As I said several times throughout this section
    > Interfaces are contracts, they should not have code, no implementation, no static methods, no private methods,
    no field, nothing! Just method declaration, period
    Again, when Jon tells me why we need these features in interfaces. I know he knows nothing about interfaces and OOP
    in general. That's why he hates it! And that's why he loves functional programming, because in functional
    programming he doesn't have to worry about any of the subtle yet  important details. He doesn't need to hide the
    implementation detail, he doesn't need to understand the difference between tightly and loosely coupled code, and
    how to use interfaces to achieve a loosely coupled design.

    Just to clarify, I'm not saying functional programming is useless, or OOP is superior. Not at all, they are both
    great paradigms for building software, and they have their own uses. All I'm saying is people like Jon hate OOP,
    because they didn't learn it properly, they didn't learn essential concepts and techniques and ended up writing
    ugly unmaintainable and complex code. That doesn't make OOP rubbish, just because you don't know how to use
    something PROPERLY, doesn't mean it's bad.
     */
}
