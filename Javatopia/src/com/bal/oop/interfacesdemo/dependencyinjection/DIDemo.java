package com.bal.oop.interfacesdemo.dependencyinjection;

public class DIDemo {
    /*
    According to this concept, our classes should not instatiate or new up their dependencies.

        DI principle says we should not worry about creating the calculator object, it should only use it. Creating a
        calculator object and using it are two different concern and we need to separate them. This is what we call
        > the separation of concerns.
        Analogy, think of a restaurant. Each person in a restaurant has a separate row, we don't want a chef to come and
        take orders. We want these concern be separated and everyone want to refocus on what they are responsible for.
        We want to take this responsibility of creating this dependency from this report class and give it to another
        class. We will have that class if our report class calculator object. This is what we call DI. So that other
        class will pass or inject dependency. Now we have
        > various ways to inject dependency
            > Constructor Injection > we can pass a dependency via the constructor of a class
            > Setter Injection> we can also pass a dependency by a setter
            > Method Injection

     */
    /*
    //constructor injection
        // the most used
//        var showCIReport = new ConstructorInjectionDemo(
//                new TaxCalculator2023(100_000));
//        showCIReport.show();

        var setterMethodInjectionDemo = new SetterMethodInjectionDemo();
        //setter injection
//        setterMethodInjectionDemo.setCalculator(new TaxCalculator2024());
        //method injection
        setterMethodInjectionDemo.show(new TaxCalculator2023(100_000));
    }

    with the changes we have made so far
    > decoupled our report class from our calculator implementations
    > but we still have coupling here. Our report class is coupled for taxCalculator interface. We couple to this
    contract, but this coupling is so far then coupling to a class, because here we don't have code, we don't
    implementation. If we change how we calculate the tax, our report class is not going to get affected it, but if we
    change this contract by adding a new method, or changing one of the existing ones, of course we have broken the
    contract, the classes that are dependent on this kind of contract will be broken. So we should be careful when
    designing these interfaces, we want to make sure these interfaces are small and lightweight so they are less likely
    to change we don't want to create big-fat interfaces, with a lot of methods we are going to end up modifying or
    removing.
     */
}
