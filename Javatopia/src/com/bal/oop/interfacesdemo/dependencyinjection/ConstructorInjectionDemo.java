package com.bal.oop.interfacesdemo.dependencyinjection;

import com.bal.oop.interfacesdemo.interfaces.creatinginterface.TaxCalculator;

public class ConstructorInjectionDemo {
    /*
    DI using constructors
    We don't want our CIDemo class to be dependent on implementation, we want to be dependent on an interface
     */
    private TaxCalculator calculator;

    /*
    Our CIDemo construct doesn't know anything about  a concrete implementation, it's only working with an interface.
    This is what we call
    > programming against interfaces. It's the responsibility of another class like our DemoMain class to inject these
    concrete implementations. Now today we are using taxCalculator 2023. Tomorrow we can create  another class like
    taxCalculator2024. And pass this to our taxReport(ConstructorInjectionDemo). Our CIDemo doesn't care, it's not
    affected.Also, if  we have go back to this concrete implementation and change the code here,for example our
    calculateTax() method in TaxCalculator 2023:
    > return taxIncome * 0.4 //* 0.1 ...
    our DIDmo is not affected. Yes, the code in this class has to be recompiled. But because the DIDemo is not on that
    concrete implementation, it doesn't need to recompile, it doesn't need any modification. so this is loose coupling
    in action.

     */

         /*
        var calculator = new TaxCalculator2023(100_000);

        the way we have injected this dependency here, is what we call
        > poor mans dependency injection. In this simple program we have only 2 classes. We can easily create and inject
        these dependencies by hand. In a larger application, you might have hundreds of classes, and these classes might
        have several dependencies. You don't want to create hundreds of objects in your main method and pass them to
        constructor of your classes. That's where we use a
        > dependency injection frameworks.
        There are frameworks out there that makes it really easy to pass these dependencies to our classes.
        > Spring is one of the popular ones.
        How these frameworks work and how we can use them > we will look at that in the future


        var constructorInjectionDemo = new ConstructorInjectionDemo(calculator);

         */


    public ConstructorInjectionDemo(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

}
