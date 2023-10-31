package com.bal.fundamentals.controlflow;

public class TemaryOperatorDemo {
    int income = 120_000;

    public void demo(){
        //professional way
        //ternary operator
        String className = income > 100_000 ? "First" : "Economy";

//        String className = "Economy";
//        //better code
//        if (income > 100_00)
//            className = "First";

        //amateurish code
//        if (income > 100_000)
//            className = "First";
//        else
//            className = "Economy";
    }
}
