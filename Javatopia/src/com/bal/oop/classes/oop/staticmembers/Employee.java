package com.bal.oop.classes.oop.staticmembers;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        /*
        Now you need to know about these static methods, is that they can
        only see  other static methods in this class. Here in this static method, even though we are inside the employee
        class, we cannot access the calculateWageMethod(), because this method belongs to an employee object. It's an
        instance method. So we have to create an employee object, and then we will be able to access this method. That's
        something we need to remember. That's the reason why in the first part of the series, all the methods that we
        added to our main class, we declared them static. So we would call them from the static (main) method.

        Why the main method is declared as static
        This is enable the java runtime to directly call this method without  having to create a new object. So that's
        why the main method it's always declared as static.

        example System.out.println()
        System class that we have here , has a bunch of static members, out is one of these static fields

        Another example an Integer (wrap class)
        Integer.parseInt()

         */
        new Employee(50_000).calculateWage();
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage() {
        return baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Base salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }
}
