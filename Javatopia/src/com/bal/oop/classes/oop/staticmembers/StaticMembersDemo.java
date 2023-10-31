package com.bal.oop.classes.oop.staticmembers;

public class StaticMembersDemo {
    /*
    static members
    > static fields
    > methods

    We have seen static keyword in the main method. What is all about?
    In OOP, a class can have 2 types of members:
    > instance members
        > belong to instances or objects
            > for example: in our employee class all the members are instance members
            > we access these members using the dot operator
                > employee.calculateWage()
                > employee. > these all are instance members
    > static members
        > In contrast we have static or class members
        > These are the fields or methods that belong to a class, not to an Object
            > if we type
                > Employee. > we don't see anything > because this class doesn't have static fields or methods
                > what is the purpose of these static members?
                    > We use the in situation where present a concept that should be in a single place like
                        > numberOfEmployees
                    > these concepts does not belong to any individual employee. So this where we use static members
     */
    public void demo() {
        var employee = new Employee(50_000, 20);
        /*
        With static fields we don't have to create an object. We access them directly through the class

        We use static field in situations where a value in independent of objects. You are going to share it across all
        objects. Now you can also create static methods.

        Now our employee class has 2 static members.
         */
        Employee.printNumberOfEmployees();
        //System.out.println(Employee.numberOfEmployees);
    }
}
