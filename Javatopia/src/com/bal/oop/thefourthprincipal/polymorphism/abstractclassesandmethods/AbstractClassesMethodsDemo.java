package com.bal.oop.thefourthprincipal.polymorphism.abstractclassesandmethods;

public class AbstractClassesMethodsDemo {
    /*
    We are going to talk about abstract classes and methods.

    Abstract classes
    We use abstract classes in situations  where we declare a class but we don't want to be able:
    > to instantiate it.
        > to create a new instance of that class.


     */

    public void demo(){
        /*
        in the last course we have created this array of ui control object. In this array you can have an instance of
        ui control of any of it is subclasses. Like a text box or check box and so on. We can to create here a new
        instance
        UIControl[] controls = { new UIControl(), new TextBox(), new CheckBox()};
        No there is the problem here, what is UI control? You don't really know, it's an abstract concept. How are we
        going to RENDER this control? We don't know. That is reason why we left the implementation of this method empty.
        So the whole purpose of this class is to provide some common code for it's subclasses like text box or check
        box. We know what a tect box is, we know what a check box is we don#t have to render it. But ui control,
        we don't really know. it's an abstract concept.
        In situation like this we can declare this class as abstract and we can not instantiation anymore. we can only
        extend and create new classes that derive from the ui control. Now we can take this to the next level.
         */
        UIControl[] controls = { new TextBox(), new CheckBox()};
        for (var control : controls)
            control.render();
    }
}
