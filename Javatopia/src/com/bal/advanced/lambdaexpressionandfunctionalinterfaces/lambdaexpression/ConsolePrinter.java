package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.lambdaexpression;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
