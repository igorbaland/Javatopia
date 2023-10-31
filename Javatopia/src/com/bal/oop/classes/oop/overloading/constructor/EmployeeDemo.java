package com.bal.oop.classes.oop.overloading.constructor;

public class EmployeeDemo {
    public void demo() {
        var employee = new Employee(
                50_000, 20);
        int wageWithoutExtraHours = employee.calculateWage();
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
