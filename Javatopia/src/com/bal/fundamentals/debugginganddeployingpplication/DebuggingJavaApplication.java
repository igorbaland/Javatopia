package com.bal.fundamentals.debugginganddeployingpplication;

public class DebuggingJavaApplication {
    public void demo() {
        /*
        insert breakpoints
            > run (menu on the tab)
            > click right of line numbers
            > ctrl +f8

        > the execution will stop, before the breakpoint
        > on the top we have a toolbar
            > step over (F8)
            > step into (F7)
            > step out (shift + F8)
        > switch from debugger to console we can see output: Start

         */
        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");
    }
    public void printNumbers(int limit) {
        for (int i = 0; i <= limit; i++)
            System.out.println(i);
    }
}
