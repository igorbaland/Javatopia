package com.bal.oop.thethirdprincipal;

import com.bal.oop.thethirdprincipal.inheritance.TextBox;
import com.bal.oop.thethirdprincipal.inheritance.UIControl;

public class InheritanceDemo {
    /*Let's imagine we want to build framework for building graphical user interfaces. So other people can use this
     framework to build applications with a graphical user interfaces. We can create forms with various types of input
     fields, like text boxes, drop down lists, and so on. Now all these objects share some kind of common behavior.
     For example, we can enable or disable them, we can set their size in terms of their width and height on your
     screen, and so on. When coding these classes, we don't want to implement all these features in every single class.
     That's where we use inheritance to reuse code. So we define all the common behavior in a single class, let's call
     it ui control and then have other classes inherit these behaviors from this class. In this example, we refer to the
     ui  control as the base class super class or parent, and the text box as a sub class or child. Let's see this in
     action.

     Inheritance:
     > reuse it
        >Now let's see you want to create a text box class, we don't want to repeat all this code, we want to reuse it,
        and that's where we use inheritance.
     */

    public void demo() {
        var control = new TextBox();
        /*
        These control object has these two methods that we declared in our text box class, but it also has three methods
        that we declare in our UI control class so inherited these three methods. We also have a bunch of other methods,
        these are inherited from another class in java which we are going to talk about next.
         */
        control.disable();
        System.out.println(control.isEnabled());
    }
}
