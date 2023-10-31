package com.bal.oop.thefirstprincipal;

public class Employee {

    //declare three fields, but we are not going to initialize this to this value, because we want to hard code to all
    //employee objects, this is just a blue print. Late when we create an employee object for each employee we set the
    //base salary
    public int baseSalary;
    public int hourlyRate;
    //public int extraHours;

    public int calculateWage(int extraHours) {
        /*
        we are storing these values inside these fields in this class, because of that we don't need parameters

        This is the first sign of OOP.
        Our calculate which method has no parameters. Previously we have three parameters, now we have no parameters.
        So instead of passing values around, we should encapsulate these values with the methods that operate on them
        inside a single object.

        Now let's make an assumption. Imagine that the baseSalary and the hourlyRate are fixed for one year, but the
        extraHours is going to be a different every month. So we don't want to store that in these field, instead you
        want to pass that as an argument to this method. add parameter int extraHours to calculateWage() method and
        remove it from local field


         */
       return baseSalary + (hourlyRate * extraHours);
    }
}
