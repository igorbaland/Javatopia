package com.bal.fundamentals.controlflow;

public class ForLoopsDemo {
    public void demo() {

        //reverse order
        for(int i = 5; i > 0; i--)
            System.out.println("hello world " + i);

        for (int i = 0; i < 5; i++)
            //if we have multiple statements, we need to define block
            System.out.println("hello world" + i);
    }
}
