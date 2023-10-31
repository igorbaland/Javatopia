package com.bal.oop.thefirstprincipal;

public class EmployeeWithSetterGetter {
    //public is accessible outside of this class
    //private is not accessible outside of this class
    private int baseSalary;
    //generate automatically getter and setter
    //alt + enter
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        /*
        with this method we are preventing an employee objecct from going to an invalid state
         */
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        //if you want to read the value of this salary
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
