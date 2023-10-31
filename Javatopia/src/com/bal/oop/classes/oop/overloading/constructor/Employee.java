package com.bal.oop.classes.oop.overloading.constructor;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    /*
    we can also overload constructors, because technically constructors are also methods
     */
    public Employee(int baseSalary) {
        //the second way
        //this > reference to the current object
        /*
        we are using the logic the logic that we have in this method and that is better
         */
        this(baseSalary, 0);
        //the first way
//        setBaseSalary(baseSalary);
//        setHourlyRate(0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
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
