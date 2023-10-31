package com.bal.fundamentals.controlflow;

public class IfStatementsDemo {
    public void demo() {
        int temp = 32;

        //

        if(temp > 30) {
            System.out.println("it's a hot day");
            System.out.println("drink water");
        }
        //better code > if/else if/if on the same lvl/symmetric. Easier to read
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
    }
}
