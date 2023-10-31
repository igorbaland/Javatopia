package com.bal.oop.thefirstprincipal;

public class EncapsulationDemo {
    /*
    the first principle of OOP > ENCAPSULATION
    > Bundle the data and methods that operate on the data in a single unit or object
     */
    public void demo() {
        /*
        back to our procedural programming calculate wage.
        the variables in our methods demo() and calculateWage() in ProceduralProgrammingDemo.java are LOCAL to their
        methods. There are not accessible outside this method. On the other hand we have this calculateWage,
        we are passing these variables as arguments to calculateWage method. Here we should follow the encapsulation
        principle and bundle these variables in this method inside the single unit

        What should we call that single unit or class?
        In the class ProceduralProgrammingDemo.java we are dealing with a concept of an employee, because we are
        we are calculating the wage of that employee. So let's add the Employee class class.
         */

        /*
        with encapsulation our code:
        > is now cleaner
        > has fewer lines of code
        > easier to maintain
        > we have encapsulated the data and the method that operators on the data inside a single class. If tomorrow
        we want to build another application that involves calculating the wage of our employees, we can simply copy
        this class to that project or put it in reuseable libraries. We don't have to copy paste code around
         */
        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
