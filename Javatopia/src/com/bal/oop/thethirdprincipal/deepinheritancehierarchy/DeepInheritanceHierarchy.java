package com.bal.oop.thethirdprincipal.deepinheritancehierarchy;

public class DeepInheritanceHierarchy {
    /*
    So you have seen the benefits of inheritance. With inheritance we can reuse and achieve polymorphic behavior, that's
    great. However, as I always say, too much of a good thing is a bad thing:
    > do not create deep inheritance hierarchies, this is one of the common mistake that a lot people new to inheritance
    make. Let's say we are building a web application where students can sign up as students or instructors. An amateur
    developer might come up with an inheritance hierarchy like this. So we have regular and premium instructor classes.
    Both these classes share some common attributes and behaviors, so we can extract the common code into a base class
    like instructor. We also have students, but both students and instructors have a few things in common. For example,
    they both have username and password. So we can extract the common code into a base class like user. On the other
    side we have courses. These courses have a few attributes like id, name and so on. We need the same attributes in
    the user class, so we can extract a new base class like entity, and put these attributes like there. What is the
    problem here? Well classes involve an ihneritance hierarchies are tightly coupled with each other. So here both the
    user and course classes are tightly coupled to the entity. If you make any changes to the entity, you have to modify
    the user and course classes. For example, if we changed the constructor of the entity and add or remove a parameter,
    you may have to modify these child classes. Even if you don't have any breaking changes , just because the entity
    class is changed, it has to be recompiled and redeployed. And that means, all these children and grandchildren, as
    well as every other class that depends on any of these classes should be recompiled and redeployed. Also, in this
    deep hierarchies, it is likely that you introduce a new field or method in one of your base classes, but that field
    or method does not make sense to be inherited by it's children. So you end up polluting your hierarchy with
    irrelevant stuff.
                                           Entity
                                        /       \
                                   User         Course
                                   /    \
                       Instructor       Student
                       /        \
     premiumInstructor          regularInstructor

    So among deep inheritance hierarchies, inheritance is good, but

    > up to one or two levels, no more then 3 3 levels. Beyond that you are really going to the wrong direction. So here
    we should collapse this hierarchy. Let's say both the and instructor classes need an attribute like last login. We
    can redefine this in each class. Yes, we are duplicating a bit of code but now these two classes are decoupled and
    they devolve independent without impacting each other. Also, we don't need seperate classes for regular and premium
    instructors. All we need is a boolean field like is premium. You can simply differentiate between different types of
    instructors. Just because a premium instructor isn't an instructor, doesn't mean we should use inheritance within
    them.






     */
}
