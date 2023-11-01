package com.bal.oop.interfacesdemo.staticmthods;

public abstract class AbstractTaxCalculator
        implements StaticMethodInterfacesDemo{
    /*
    we don't want to be static, because this is implementation detail, only the real concrete calculator methods should
    use this method. This is where we use
    > PROTECTED access modifier. We hide this method from the outside, but you will be able to use it in classes that
    inherit it from this abstract tax calculator.

    protected > children/subclasses
    default > own package package
     */
    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
