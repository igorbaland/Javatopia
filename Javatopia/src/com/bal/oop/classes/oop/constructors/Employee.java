package com.bal.oop.classes.oop.constructors;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //create a constructor
    public Employee(int baseSalary, int hourlyRate) {
        /*
        now  we have a custom constructor, and java compiler is not going to create  a default constructor for us.
        So in this constructor, we want to initialize these fields based on the values that we receive here.
        2 ways to do this:
         */
//        this.baseSalary = baseSalary;
//        this.hourlyRate = hourlyRate;
        /*
        with this implementation we can still pass 0 or a negative value as the baseSalary and hourlyRate. The Employee
        Object will start at an invalid state. So here we should use the setters that we created. These setters will
        throw an exception, if we tried to create an employee object with invalid values our program is going to crash.
        we will never an employee object in the backstage in memory.
         */
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Base salary can not be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

}
