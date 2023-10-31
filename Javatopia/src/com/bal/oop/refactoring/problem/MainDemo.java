package com.bal.oop.refactoring.problem;

import com.bal.oop.refactoring.solve.Console;
import com.bal.oop.refactoring.solve.MortgageCalculator;
import com.bal.oop.refactoring.solve.MortgageReport;

public class MainDemo {
    /*
    we don't have
    > encapsulation
    > abstraction
    We just have a bound of methods calling each other, this is what we call procedural
    We want to refactor this code towards object oriented design
    Refactoring change the structure of the code without its behavior

    What classes do we need in our application?
    That depends on the concerns or responsibilities your application deal with.
    Metaphor
        Think of a restaurant. In a restaurant we have different people working together to provide a service. Each
        person has a clear and predefined responsibility. We have a chef, a waiter, a waitress, a cashier and so on.
        So each person in a restaurant is like an object. All these objects collaborate together to provide some service
        We should design our classes or objects in similar fashion. We should find the concerns or responsibilities in
        our application, and make sure that each class has a single responsibility

    In the main method we are calling a
    > readNumber()
        This method is responsible for reading a number from the CONSOLE. So potentially we can create a console
        class and move this method there. Then in the future whenever we want to build a console or command line
        application, we can reuse that class to read a number from the console.

    What else do we have?
    > printMortgage()
        These method is calling calculateMortgage() method. See here, we are just calling methods one after another.
        This is procedural programming, we are not using objects we don't have encapsulation. We don't have abstraction.
        So this print mortgage method is responsible for printing monthly payments in a nice format. Some kind of report
        Potentially we can create a class called mortgage REPORT and move this method there.
    > printPaymentSchedule()
        very similar printMortgage(), all we are doing here is some kind of report. This method is using the
        calculateBalance() method, to get some data, and then it prints on console. Maybe asking wouldn't it be better
        if we moved this method to our console class? No, because that console class is a generic (uebergeordnet)
        class, it doesn't know anything about mortgage, if we moved this method there, then that class is going to get
        a little bit bloated for something that you shouldn't be responsible for. This is like where the chef comes and
        takes orders. so we want to make sure that each class or each object has a single responsibility. Our console
        class is going to be generic, it's only knows how to read values from the console. It doesn't know about
        mortgage or any other kinds of domains.

    > calculateBalance() and calculateMortgage()
        the parameters are redundant in these two methods. This is what we call procedural. We are just calling methods
        and passing values around. Now whenever you are passing the same values to multiple methods, that is a great
        opportunity to apply the encapsulation principle. So here want to encapsulate these values, and the methods that
        apply to them like calculateBalance() and calculateMortgage(), inside a single object. So instead of passing
        these values around, you want to store them inside the fields a class. And then our calculateBalance method is
        not going to have 4 parameters. It's only going to have this parameter.

    Refactoring via IntelliJ
    > Refactor > Refactor this > move these members (only static members)

     */

    public void show() {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }

}
