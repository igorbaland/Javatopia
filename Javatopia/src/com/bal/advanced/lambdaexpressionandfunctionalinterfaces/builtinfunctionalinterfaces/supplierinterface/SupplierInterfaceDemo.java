package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.supplierinterface;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    /*
    The supplier interface is the opposite of the consumer interface. Instead of consuming value,  it's supplies a value

    single abstract method
        > T get(), which returns a value of Type T

    Note:
        > () -> Math.random(); WILL NOT EXECUTED until we explicitly call
            > var random = getRandom.get();
            This is called
                LAZY EVALUATION, the value is not generated until we explicitly asked for it.

    Also, just like the consumer interface, this supplier interface
        Supplier<Double> has a few specializations for working with
            > primitive values
                > DoubleSupplier
                > IntSupplier
                > LongSupplier
                > BooleanSupplier
    If we are working with primitive values prefer to use primitive specializations of supplier interface, because you
    don't pay the cost of auto boxing primitive value inside a reference type and then unboxing it later on.
     */
    public static void show() {
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);
    }
}
