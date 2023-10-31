package com.bal.oop.thesecondprinipal;

public class Employee {
    /*
    we made this field private, because these fields are likely transistors inside the remote control. we don't want
    to directly work in these fields. They are implementation detail. Tomorrow we may decide to replace these two
    integers with an array? If you make that change, all the other classes that are using this employee class have to
    be updated.

    So you want to hide the implementation detail an expose a bunch of the methods for other to use.
    For example, we have a setter and getter, to work with the baseSalary. Now here we have a 1 to 1 relationship
    between the underlying field, and this getter and setter. But in more complex appliations, we are not necessarily
    going to expose a getter and setter for every field. For example, you might have a TV object you simply call the
    set channel method., and this method will internally  set a few different fields. We don't know what fields are set
    to what values, we don't care, all we want is to change the channel of our tv.

     */
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

    public int getBaseSalary() {
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
