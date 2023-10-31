package com.bal.oop.thefourthprincipal.polymorphism;

public class PolymorphismDemo {
    /*
    Three principles of object-oriented Programming
    1) Encapsulation
    2) Abstraction
    3) Inheritance
    4) POLYMORPHISM
        > poly > many
        > morph > form
        > polymorphism > many forms
    This is one of the features of object-oriented programming languages that allows an object to take a different
    forms, this is extremely powerful. This is extremely powerful. We are going to create an array of control objects
    and render each object on the console.
     */

    public void demo() {
        /*
        Imagine you want to render a form that has multiple control objects. You could have a few text boxes, check
        boxes, a radio button and so on.
        Now if you want to render different control objects in a procedural way, we will end up writing code like this
        array
        UIControl[] controls = { new TextBox(), new CheckBox() };
        We iterate over this array
        for (var control : controls)
            //if control is textBox
            //      render TextBox
            //otherwise if it is CheckBox
            //      render CheckBox
            //and so on
         This is a procedural way of solving this problem. The problem is we are going to end up with a big fat if
         statement and every time we declare a new class that extends the ui control, we will have to come back here
         and modify this statement.
         These is where we apply the polymorphism principle of object-oriented programming.
         Now we can go to the UIControl class and create render() method.
         */
        UIControl[] controls = { new TextBox(), new CheckBox() };
        /*
        This is polymorphism in action. So
        > at compile time we have declared this array as an array of ui controls. But
        > at runtime we are insert different objects inside this array
        [0] > a textBox, [1] > CheckBox

        When we iterate over this array, obviously we are dealing with different types of objects. Each object has it's
        own render method. So this  control object that we are working with is taking many different forms,
        polymorphism.
         */
        for (var control : controls)
            control.render();

    }

}
