package com.bal.oop.interfacesdemo.interfaces.creatinginterface;

public interface TaxCalculator {
    /*
    In c# we prefix our interfaces with capital I > ITaxCalculator > to indicate that is an interface.
    In Java is not very popular.
    In Java interface prefixes:
    > Can > CanCalculateTax
    > Able
    > Draggable
    > Resizable

    In this interface we don't have state or data, so we don't have any fields
    > We only have method declarations that determine what needs tobe done.
    In this case, we need to be able to calculate the tax.

    Here we have an abstract method, because we don't have
    > curly braces > we only have a method declaration

    public double calculateTax();
    Look at the public keyword > it's greyed out > that means it is not necessary here. It's redundant. Because every
    method we declare here, has to be implemented by a class, and these methods should be public there, so they can be
    accessed by other classes. Because this interface determines the public interface of this class,
    > the public contract

     */
    double calculateTax();

}
