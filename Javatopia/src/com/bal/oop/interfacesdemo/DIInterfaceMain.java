package com.bal.oop.interfacesdemo;

import com.bal.oop.interfacesdemo.dependencyinjection.ConstructorInjectionDemo;
import com.bal.oop.interfacesdemo.dependencyinjection.SetterMethodInjectionDemo;
import com.bal.oop.interfacesdemo.taxescalculators.TaxCalculator2023;
import com.bal.oop.interfacesdemo.taxescalculators.TaxCalculator2024;

public class DIInterfaceMain {
    public void demo () {
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
}
