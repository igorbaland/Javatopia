package com.bal.oop.thethirdprincipal.objectclass;

import com.bal.oop.thethirdprincipal.inheritance.TextBox;

public class TheObjectClass {
    /*
    so every class that we declare directly or indirectly inherits from the object class. so, earlier we declared  this
    this text TextBox class, this class extends for inherits from the ui control, and ui control in turn extends from
    ihnerits from the object class. Now here we didn't explicitly type extends object the java compiler automatically
    asks this for us. This is the reason why every class we declare has some additional methods.

    What are these?

     */
    public void demo() {
        //var obj = new Object(); //java.lang > available everywhere
        //let's look at the members of this object
        /*
        > getClass > return Class object, and with this we can read the metadata of an object. For example we can define
        all the fields and methods combined in that object
        > equals(Object obj) > comparing objects
        > hashcode() > return address of this object in memory
        > toString() > return the string representation of an object
        // we will look at these methods more details over time
        > notify() > notify all which are used in concurrency methods
        > wait () >
        ...
         */
        //obj.
        var box1 = new TextBox();
        /*
        we get this integer and this is calculated based on the address of this object in memory. A lot of people think
        this is the address of this object in memory but that is not correct, the address of this object goes through a
        function called a has function, and the job of this function is
        > to get a value, and map it to numeric value which we call hash.
        So this is a hash code of this object.

        Why does this matter?
        This hashcode is used in a lot of situations. One of the is:
        > comparing objects for equality
        Both these variables are referencing the same object in memory. So they should have the same hash code. Let's
        take a look, I'm going to duplicate this line and also

        As you can see we get the same value. Earlier I mentioned the equals method, so with this method we can check
        objects for equality, now if you pass:
        System.out.println(box1.equals(box2)); // return true
        Because both these variables are references in the same object and they have the same hash code.

         */
//        var box2 = box1;
        var box2 = new TextBox();
        //because they are in different locations in memory and they have different hash codes
        /*
        they are situations where you don't want to compare objects by their hashcode, you want to compare them based on
        their content. For example, imagine we have a point class. A two dimensional point has x and y coordinates. Now
        if you have two point objects and both these point objects have exact same coordinates, technically they are
        equal. So, in that case, we don't want to compare two point objects based on the hash code, we want to compare
        them based on their content. This is one of those situations where we can change the implementation of
        the equal method, so instead of comparing by their hashcode, we can compare them using the values stored in
        their field
         */
//        System.out.println(box1.equals(box2));  //return false
//        System.out.println(box1.hashCode());

        /*
        toString Method > return te  string representation of an object which has two parts, the fully qualified name of
        the class, which contains the package it originally is from, followed by name an @ sign and finally the hash
        represented as hexadecimal. This values to here, is the hashcode of this object represented in hexadecimal.
        com.bal.oop.thethirdprincipal.inheritance.TextBox@7229724f

        There are situations where the default implementation of the 2 string method is not desirable (wuenschenswert),
        but we can always change it. For example, if you had a point class, you can change the two string method,
        so instead of returning  a string, it can re return the x and y coordinates. So this is all about the object class

         */
        System.out.println(box1.toString());
    }
}
