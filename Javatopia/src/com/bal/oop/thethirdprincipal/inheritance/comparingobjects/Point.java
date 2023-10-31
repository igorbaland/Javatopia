package com.bal.oop.thethirdprincipal.inheritance.comparingobjects;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
    with intellij generate
    > alt + paste > equals() and hashCode()
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    /*
    shortcut for override method
        > ctrl + o
     */
//    @Override
//    public boolean equals(Object obj) {
//        /*
//        in this implementation we are calling the equals method in the super which is our base class, we don't want
//        this, we are going to change it. type parameter is an object, that means, we can pass an instance of any classes
//        that derives from the object class. But here we only want to deal with points, so here's the problem. If we
//        change the parameter to point we are not overriding the equals method in the object class. This is entirely
//        different method, because it has a different signature, it has a different parameter. So we should divert this
//        back to object and downcast this object to the point class. It works, but our implementation has a problem. I
//        told you that because the type of this parameter is an object, we can literally pass any kind of object to this
//        method.
//        >  System.out.println(point1.equals(TextBox);
//        We got an exception ClassCastException
//
//        How can we solve this problem?
//        before casting we need to mask sure that this object passed here at runtime is an instance of the point class.
//        This implementation is a little big ugly because we are indenting
//         if (obj instanceof Point) {
//            var other = (Point) obj;
//            return other.x == x && other.y == y;
//        }
//        We can simplify this by reversing this condition.
//        With this approach we no longer have to add these curly braces, and indent our code. So if we get to this point,
//        this is obvious that this object is an instance of the point class. So, we cast it and then we check the
//        coordinates of these two point objects
//
//        What if we compare an object to itself?
//        sout(point1.equals(point1)
//        Our program still works but here we can apply an optimization technique. Instead of the evaluating this
//        expression,
//         return other.x == x && other.y == y;
//        we can simply compare these two objects by the references. If they are referencing the same object that means
//        these 2 points object are equals. First we are going to make sure that references are equals
//        if (this == obj) return true;
//        So we are checking to see if current object and this object what we received here have the same reference or
//        address in memory. So this is the proper way to override the equals method and compare objects based on their
//        content. Now as a best practice, whenever we override the equals method, we should also override the hashcode
//        method.
//
//        */
//        if (this == obj)
//            return true;
//
//        if (!(obj instanceof Point))
//            return false;
//
//        var other = (Point) obj;
//        return other.x == x && other.y == y;
////        if (obj instanceof Point) {
////            var other = (Point) obj;
////            return other.x == x && other.y == y;
////        }
////        return false;
////        return super.equals(obj);
//    }
//
//    @Override
//    public int hashCode() {
//        /*
//        this implementation is calling the hashCode() method in the base class. Instead we want to generate hash code
//        based on the of this object, based o the values of the x and y fields.
//
//        How can we do that? We have a class called objects, this is declared in java.util package. Now this class has a
//        method for generating a hash value. So we can give it a bunch of values and it will map this values to hash
//        value. Now hash is theory, uniquely identifies object. It's not 100% accurate, but it works for 99% of the time.
//        Now look at the type of this parameter.
//        Objects.hash(Object... values)
//        This means that we can pass a varying number of arguments to this method. We can give it one argument or two
//        arguments or more. The java compiler will pack these arguments into an array.
//
//        We can see that both these objects have the same hashcode which is based on the content of these objects.
//        In contrast, the default implementation of the hashcode method, generates a hash, based on the address of an
//        object in memory.So, if we comment our implementation of a hashCode, we are going to see two different hashes.
//        So here we override these two methods by hand, but we can have intelliJ
//
//         */
//        return Objects.hash(x, y);
//    }
}
