package com.bal.oop.thethirdprincipal.inheritance.methodoverriding;

public class OverridingMethodDemo {
    /*
    There are situations where we inherit a method from a base class, but we are not happy with the implementation, we
    want to change it, this is what we call method overriding. So we override a method declared in the base class. Now,
    don't confuse this with method overloading. method overloading means declaring a method multiple times but with
    different signatures, different parameters.

    Example of overriding
    You know that every object has these toString method, that is inherited from the base object class
     */
    public void demo() {
        var textBox = new TextBox();
        textBox.setText("Hello world");
        /*
        here we don't have to explicitly call the two string method, because the print line method automatically calls
        the toString method on any objects that we pass here.
         */
        System.out.println(textBox);
    }
}
