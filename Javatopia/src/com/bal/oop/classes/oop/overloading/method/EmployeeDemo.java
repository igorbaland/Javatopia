package com.bal.oop.classes.oop.overloading.method;

public class EmployeeDemo {

    public void demo() {
        var employee = new Employee(
                50_000, 20);
        /*
        there are situations, where we need different implementations of the methods for different parameters.
        Overloading method means, create different implementations of it with different parameters.

        Remember that overloading a method too many times will make your application hard to maintain, because you will
        end up  with so many variations and these methods will call each other, it just gets ugly.

        It's only for demo. Personally would prefer not to overload this method and pass 0 as the extra hours here.

        It's often better to overload a method, if we are dealing  with completely different types of parameter. For
        example, one implementation might take two integers the other might take an employee object. Be aware of
        method overloading, but don't overuse it.
        */
        int wageWithoutExtraHours = employee.calculateWage();
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
