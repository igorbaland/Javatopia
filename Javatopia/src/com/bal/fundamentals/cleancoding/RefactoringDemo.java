package com.bal.fundamentals.cleancoding;

import java.text.NumberFormat;
import java.util.Scanner;

public class RefactoringDemo {
    //Changing the structure of the code without changing its behavior
    //mortgageCalculator

    //disadvantages
    /*
    > over 50 lines in this method > to much
        > Ideally, our methods should be between 5-10 lines of code
        > and no more than 20
        > we need to chop/ to refactor this method, which means to extract certain pieces from this method and put them
        in other methods. Whenever you want to refactor your method, you should look for two things:
            > concepts or lines of code that always together. For example:
                Calculating the mortgage
                > double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numbersOfPayments))
                    / (Math.pow(1 + monthlyInterest, numbersOfPayments) - 1);
                > what do we need to calculate the mortgage?
                    > principal

                    this logic for calculating the mortgage is usually spread over the place in our method. You want
                    to bring this lines together and put them in a separate method for calculating the mortgage.
                    > monthlyInterest
                    > numberOfPayments

    > repetitive patterns in this code
        > while loops
     */
    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float annualInterest = 0;
        byte years = 0;

        while(true) {
            System.out.print("Principal (€1K - €1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1.000 and 1.000.000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30)
                break;
            System.out.println("Enter a value greater 0 and less than or equal to 30.");
        }

        while(true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter number between 1- 30");
        }

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    //break down parameters, if too long line
    public double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numbersOfPayments = (short) (years * MONTHS_IN_YEAR);
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numbersOfPayments))
                / (Math.pow(1 + monthlyInterest, numbersOfPayments) - 1);

        return mortgage;

    }
}
