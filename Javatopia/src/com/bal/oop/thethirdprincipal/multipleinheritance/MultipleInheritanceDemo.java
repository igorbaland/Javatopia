package com.bal.oop.thethirdprincipal.multipleinheritance;

public class MultipleInheritanceDemo {
    /*
    Designer of Java have decided not to implement this feature because it brings a number of complexities. Let's say
    C Inherits from A and B, and both these classes define a method in the same signature but different implementations
    Now, which should c inherit?
    > It's ambiguous (mehrdeutig), we don't know.
    Another example
    what if both A an B declared a field called name. Should inheritance c inherit 1 or 2 copies of the same field.
    This is another ambiguity problem.

            A                       B
            \                       /
                        C

    An extended version of this diagram is what we call the
    > DIAMOND PROBLEM
    So here B and C inherit from A, and D inherits from both B and C

                  A
            /           \
            B           C
            \           /
                  D
    So let's say A has a method like toString and we have override this with both B and C. Each implementation is
    different for obvious reasons.  Which implementation of the toString method D inherit. We don't know.

    Now here is the thing, in Java as you know , the object class is the root of all classes, so every class that exists
    in java directly or inderictly inherits from the object class. So here, A is essentially the object class in Java.
    B and C could be two independent classes like student and instructor. Now, If you have a user who can be both a
    student and instructor which toString method should it inherit?
    As you can see, because the object class is the base class for all classes in Java, we would naturally face the
    diamond problem if Java supported multiple inheritance. That's why the creators of Java decided not to support this
    feature. for the complexity it brings, they wanted java to be simple and robust.

    And to be honest, this feature is not something  you would need that often. It's rarely used. I personally have
    never felt the need of multiple inheritance.

     */
}
