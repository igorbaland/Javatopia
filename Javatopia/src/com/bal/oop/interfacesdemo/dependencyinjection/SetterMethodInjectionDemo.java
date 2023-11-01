package com.bal.oop.interfacesdemo.dependencyinjection;

import com.bal.oop.interfacesdemo.interfaces.creatinginterface.TaxCalculator;

public class SetterMethodInjectionDemo {


    /*
            The second way of DI > setters
            Here we have this private field, we can declare a setter and initialize it.
            alt + paste
             */
    private TaxCalculator calculator;

//    public SetterInjectionDemo(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    /*
    add a new interface parameter
     */
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
    /*
    put all these setters at the end of a class. That makes our code clean and consistent.
     */
    public void setCalculator(TaxCalculator calculator) {
        /*
        In addition to this DIConstructor, we can use this setter to inject DI in this class

        What is the benefit?
        The benefit is that we can change these dependencies throughout the lifetime of our program.
        Using setter injection we can change the dependencies of class throughout the lifetime of our application.
        > If this is something you need then you can use setter,
        > otherwise constructor injection is more common approach
        Setter injection is great and allows us to change the dependency of a class at
        > RUNTIME, but we will to remember to call it. Another approach is to use method injection.
        We can pass directly an taxCalculator interface to show method, because this is where we are using that
        dependency
         */
        this.calculator = calculator;
    }
}
