package com.bal.fundamentals.controlflow.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    Scanner scanner = new Scanner(System.in);
    private final byte MONTHS_IN_YEAR = 12;
    private final byte PERCENT = 100;

    public void calculate() {

        //Problem, the code is a little bit too long >> this hurts the maintainability of program.
        //Someone else reading this  code would have to look at all these statements to figure out what's going on this
        //To break this code down into smaller, easier to read and easier to understand chunks
        int principal = 0;
        float monthlyInterest = 0;
        int numbersOfPayments = 0;

        while(true) {
            System.out.print("Principal (€1K - €1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1.000 and 1.000.000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater 0 and less than or equal to 30.");
        }

        while(true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numbersOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter number between 1- 30");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numbersOfPayments))
                / (Math.pow(1 + monthlyInterest, numbersOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
