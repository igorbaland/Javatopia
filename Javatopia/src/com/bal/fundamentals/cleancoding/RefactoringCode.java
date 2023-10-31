package com.bal.fundamentals.cleancoding;

import java.text.NumberFormat;
import java.util.Scanner;

public class RefactoringCode {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    public void show() {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        //Whenever you want to refactor a message
        // > repetitive parents in the code
        // > highly related > that always go together

        //Refactoring via IntelliJ
        //select lines > mouse right click > Refactor > Extract Method || ctrl + alt + m
        printMortgage(principal, annualInterest, years);
        printPaymentShedule(principal, annualInterest, years);
    }

    private void printPaymentShedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCCHEDULE");
        System.out.println("_________________");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balancce = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balancce));
        }
    }

    private void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numbersOfPayments = (short) (years * MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numbersOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numbersOfPayments) -1);

        return balance;
    }

    public double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numbersOfPayments = (short) (years * MONTHS_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numbersOfPayments))
                / (Math.pow(1 + monthlyInterest, numbersOfPayments) - 1);

        return mortgage;
    }
}
