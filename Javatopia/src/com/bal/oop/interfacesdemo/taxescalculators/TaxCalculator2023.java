package com.bal.oop.interfacesdemo.taxescalculators;

import com.bal.oop.interfacesdemo.interfaces.creatinginterface.TaxCalculator;

public class TaxCalculator2023 implements TaxCalculator {
   private double taxableIncome;

    public TaxCalculator2023(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        /*
        this method is the implementation of the calculateTax() method that we declare in our interface. Our interface
        said every class that implements me, should have
        > a public method with the exact same signature there is just one piece missing.
        Even though we don't have a compilation error here. As a best practice, we should apply the override annotation
        to interface methods.

        Annotations
        > are labels that we attach to our methods or classes, and with this we give extra information to the java
        compiler.
        What is the benefit of doing this?
        Here we are telling the Java compiler that this method is the implementation of the calculate tax method in our
        interface. If in the future we decide to remove this method from our interface we will be get a compilation
        error because we are telling the Java compiler that this method is overriding or more accurately implementing
        an interface method, but this method does not exist in our interface. This is benefit of using annotation or
        label.
         */
        return taxableIncome * 0.8;
    }
}
