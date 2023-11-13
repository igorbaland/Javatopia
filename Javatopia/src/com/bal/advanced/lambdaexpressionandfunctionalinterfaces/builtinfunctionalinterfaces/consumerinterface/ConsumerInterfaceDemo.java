package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.consumerinterface;

import java.util.List;

public class ConsumerInterfaceDemo {
    /*
    The consumer interface represents an operation, that takes a single argument and doesn't return a value.
    Why does it matter?
    A lot of methods in java  expect an object that implements the customer interface. I will show you an example, later
    in this section. But first let's take a look of this interface. As we can see, we have a single abstract method
    called
        > accept(T t), takes an argument of type T and T is a generic type parameter. This method doesn't return a value
    We also have a default method
        > andThen(Consumer<?super T> after), this default method has an implementation. We are going to talk about in
        the next section in detail.

    We have a few variations of the consumer interface.
        1) BiConsumer<T,U>
            > accept(T t, U u)
        2) IntConsumer (LongCustomer, DoubleCustomer), primitive specialization of this interface
            > accept(int value)
                If you are dealing with a lot of integer values. It's more efficient to use this interface as the
                regular consumer interface.

    List.of
    List<Integer> list = List.of(1,2,3);
    There are  2 ways to iterate this.list
        //IMPERATIVE PROGRAMMING, that is basically means, implementing logic. For example whenever we have
        for loops, if/else, switch/case
        How should be done?
            > for (var item : list)
        //DECLARATIVE PROGRAMMING
        What should be done?
            > list.forEach(item -> System.out.println(item));
        This method expect a consumer object/consumer of integer. As you saw the customer interface is a functional
        interface, because it has
            > a single abstract method. We can represent using a LAMBDA EXPRESSION. In this case, we want to pass a
            lambda expression that takes an integer and doesn't return a value
     */

    public static void show() {
        List<Integer> list = List.of(1,2,3);

        for(var item : list)
            System.out.println(item);

        list.forEach(item -> System.out.println(item));
    }
}
