package com.bal.oop.thesecondprinipal.coupling;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be 0 or less.");
        this.baseSalary = baseSalary;
    }


    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    /*
    We are hiding this from outside. This is abstraction in action.
    hide:
    > the unnecessary details
    > the implementation details
    And with this we are reducing complexity
     */
    private int getBaseSalary() {return baseSalary;}
    private int getHourlyRate() {
        return hourlyRate;
    }
}
