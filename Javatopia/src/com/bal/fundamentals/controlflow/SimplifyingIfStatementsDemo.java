package com.bal.fundamentals.controlflow;

public class SimplifyingIfStatementsDemo {
    public void demo(){
        //underscore > easier to read the code
        int income = 120_000;
        //most elegant/the most professional way to implement scenario
        //to wrap this expression in parenthesis > these parenthesis make our code mode cleaner/more readable>boolean
        // expression
        //but technically we don't need parenthesis
        boolean hasHighIncome = (income > 100_000);

//        boolean hasHighIncome = false;

        //improvement, but still not ideal
//        if (income > 100_000)
//            hasHighIncome= true;

        //this code looks very amateurish
//        if (income > 100_000)
//            hasHighIncome = true;
//        else
//            hasHighIncome = false;
    }
}
