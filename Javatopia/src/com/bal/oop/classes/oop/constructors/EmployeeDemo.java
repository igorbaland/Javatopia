package com.bal.oop.classes.oop.constructors;

import com.bal.oop.classes.oop.overloading.constructor.Employee;

public class EmployeeDemo {
    public void demo() {
        /*
        This implementation still has a problem. What if we forget to call
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        Our employee object will store in an invalid state, the base salary and hourly rate are setting to 0.
        So, here we have a bad implementation, because whoever is using class has to remember to call these methods
        in order. This is the bad design. We don't want to force the consumers or clients of our class to use them in a
        particular way. This is like a magical remote control that forces you to press a and then b before you can
        change the channel, it is really strange. We want to make the interface of this class as simple as possible,
        we want to reduce the quess work.

        How can we do this?
        Well at a time we create this employee object, we want to put it in initial valid state. So we want to pass
        these values over here:
        new Employee(50_000, 20);
        We are going to create a constructor.

        Constructor
        > is a special method that is called, when we create a new object.
        new Employee();
            > this line looks like were calling a method. Well actually we do have a method by this variable name in our
            employee class. We didn't create it but the java compiler automatically creates this method, and this method
            is what we call a constructor. It is used to construct or create a new employee object. The job of this
            default construct is to initialize our fields to our defaults values:
            numbers > 0, booleans > false, reference types > null.
         */

        //show parameters of all overloaded Constructors
        //> ctrl +p
        var employeeOnlyBaseSalary = new Employee(50_000);
        var employeeWithExtraRate = new Employee(50_000, 20);
        /*
        employee. > members. We can apply the abstraction principle  and set to private setter and getter. Look at the
        interface of the employee object:
        > very simple
        > has only one method
        > beautiful implementation
        > OOP in action
         */
        int wage = employeeWithExtraRate.calculateWage(10);
        System.out.println(wage);
    }
}
