package com.bal.oop.thefirstprincipal;

public class GettersAndSettersDemo {
    /*
    We encapsulated some data and behavior around employees inside this employee class, beautiful. However,
    Employee implementation has a problem. What if in EncapsulationDemo in demo method(), we set baseSalary to 0 or
    a negative number. Our employee object is going to go in a back state, and it's not going  to be able to produce
    the right result. It's not going to be able  to calculate the wage properly.

    we need to do  some data validation, we want to make sure that the baseSalary that the user enters is a positive
    value. The one way to solve this problem, we can write if statement
    > if (baseSalary <= 0)
    If this condition is true, then we are going to print an error message
    The problem with this implementation
    > is every time we use the employee object we will to write this if statement. We don't want to do that, we want
    to encapsulate this logic inside the employee class.

    How we are going to do that
    What if we hide this field. It's not accessible outside of the employee class, and instead we declare a method like
    setBaseSalary(-1). We pass this value based method and we can do our data validation inside this method. Because
    this method is part of employee.class, wherever we use this class, we are going to have this data validation logic.
    We don't have to repeat it all over the place.


    Getters and setters are very common in java. So in java, we want to make our fields private, and instead we want
    to add getters and setters to work with them
    The

     */
}
