package com.bal.oop.interfacesdemo.fields;

public class FieldsInterfacesMain {
    public void doSomething(FieldsInInterfaceDemo calculator) {
        /*
        Why should we know that in this interface, there is a public static final field called minimumTax. This is an
        implementation detail, this is about how we calculate the tax. We don't want to worry about it. Because the
        how's  may and will change. What if we change our algorithm tomorrow and we no longer need this constant?
        We have to go back to our interface and remove this field, and that means you have broken our contract. And this
        will impact all the classes that are dependent on this contract as well as their dependencies.
        */
//        TaxCalcalutor2023.minimumTax
    }
}
