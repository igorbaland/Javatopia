package com.bal.fundamentals.controlflow;

public class LogicalOperatorsDemo {
    public void demo() {
        //operators
        // &&, ||, !
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecords = false;
        //berechtigt
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecords;



        //int temperature = 12;
        //java evaluate (auswertet) this expression from left to right
        //first, its look at the first condition. First condition > false. It doesn't matter what we have after
        //the && operator. Java will ignore the other expression
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
    }
}
