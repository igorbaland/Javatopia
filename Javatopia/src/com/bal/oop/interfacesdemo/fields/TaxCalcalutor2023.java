package com.bal.oop.interfacesdemo.fields;

public class TaxCalcalutor2023 implements FieldsInInterfaceDemo{
    public float calculateTax() {
        //use interface static members
        return TaxCalcalutor2023.minimumTax;
    };

}
