package com.bal.oop.thethirdprincipal.inheritance.comparingobjects;



public class ComparingObjectsDemo {
    public void demo() {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        /*
        if we print this expression. we get false. because both these points are references types so the values that are
        stored in these variables are the address of point objects in memory. Here we are dealing with two different
        point objects, that's whhy we have two different values inside these variables. Now, what if we use the equals
        method here. we are going to get the same result, because the default implementation of this method in the
        object compares two objects based on their references. Now this is one of those situations where you want to
        override the equals method, you are going to change it's implementation to compare it to a point object, based
        on the coordinates.

         */
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point1.equals(point1));
//        System.out.println(point1.equals(TextBox);
//        System.out.println(point1 == point2);
    }
}
