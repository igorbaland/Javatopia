package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
