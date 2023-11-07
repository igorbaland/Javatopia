package com.bal.advanced.generics.genericclassesandinheritance;

public class Instructor extends User{
    /*
    We want the instructor class to inherit from the user class. Now we have a compilation error. It says there is no
    default constructor available in user class. So earlier, we added this constructor to pass the number of points. And
    for this reason our instructor class doesn't know what values or what argument to pass to the constructor of the
    user class. To solve this problem we add a custom constructor. And here we should pass this value to the constructor
    and we do it with the SUPER keyword.
      public Instructor(int points) {
        super(points);
    }
    The problem is gone


     */

    public Instructor(int points) {
        super(points);
    }
}
