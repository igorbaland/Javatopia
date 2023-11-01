package com.bal.oop.interfacesdemo.fields;

public interface FieldsInInterfaceDemo {
    /*
    We have seen the real purpose of interfaces, they allow us to build
    > loosely coupled
    > extensible
    > testable
    applications.

    Now over  the past few years we have had a number of new features in Java that have changed the meaning of
    interfaces and in my opinion and a lot of other people's opinions
    > this has been a bad direction. We are going to look at these new features and will explain why they are bad and
    why you should avoid them, unless you really understand what you are doing, have a valid reason for using these
    features.

    The first feature we are going to talk about is
    > declaring fields in our interfaces.
        > We can declare a field like
            > float minimumTax = 100; All these fields are
                > FINAL, they are constant. Which means, we should initialize them directly and we can not change their
                value in the future.
                > Also they are STATIC, we can use them like in TaxCalculator.
    The intention behind this feature is to avoid magic numbers which are numbers that simply pop out of nowhere. This
    make our code cleaner and easier to maintain. But there are a couple things we need to think about before using this
    feature.
        > first we need to see if this value is the same across all implementations. Is it possible that the minimumTax
        would change from one year to another. It's very likely. So this constant is something that we should declare in
        our implementations. Not in our interface because once we set it in our interface, we cannot change it as you
        can see. Now let's imagine that there we are dealing with a really constant value that will never change. Like
        the number PI, or the number of months in year. The fact that we use this constant in our applications is an
        implementation detail, and that should not lead to our interface. Why should the other classes that use our
        interfaces know about this constant.
        For example > our main class (FieldsInterfacesMain > method doSomething)

    In my opinion, constants have no place in interfaces. And this is one of the bad decisions that the team behind java
    has made. Just because Java supports various features, doesn't mean you should use them. You need to understand
    these features and their implementations.
     */
    float minimumTax = 100;
}
