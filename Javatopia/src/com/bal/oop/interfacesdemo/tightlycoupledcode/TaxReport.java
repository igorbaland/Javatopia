package com.bal.oop.interfacesdemo.tightlycoupledcode;

import com.bal.oop.interfacesdemo.taxescalculators.TaxCalculator2023;

public class TaxReport {

    private TaxCalculator2023 calculator;

    public TaxReport() {
        /*
    This is the example of tightly coupled code, why?
    Because in this class, this report class we are using our tax calculator, so we are dependent on this class. If our
    calculator changes, our report class might be affective.
    Look at the constructor, currently our constructor has only a single parameter. But if you go back to our tax
    calculator and add a new parameter like double insurance > now our report class is broken. We need to come bak and
    pass an argument to this constructor. This is a not big deal in a small application, but what if we had ten classes
    that were dependent on the tax calculator? just by introducing a new parameter we will have to go back and modify
    all those classes.

     */

        calculator = new TaxCalculator2023(100_000);
    }

    public void show() {
        /*
         Another example
        we are calling the calculate tax method, if you add or remove a parameter, again, our report class is gonna
        break. Even if don't change the signature of this method or constructor, our tax report it still tightly coupled
        for calculator.
        Change signature in TaxCalculator calculateTax() taxableIncome * 0.8; //to 0.9
        This class and all dependencies have to be recompiled and redeployed. This is the PROBLEM with tight coupling
         */
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
