package com.bal.fundamentals.cleancoding;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExtensionMortgage {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    public void show() {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.println("Monthly Payments: " + mortgageFormatted);

        System.out.println();
        System.out.println("PAYMENT SCCHEDULE");
        System.out.println("_________________");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balancce = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balancce));
        }
    }

    public double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade) {

        //duplicates logic
        //> we can to move this logic to the show method
        //duplication is bad > if we need to modify a code
        //only 2 lines > is not too bad

        //In the next part we talk about object oriented programming and we will use a better way to get rid
        // of this duplication
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
