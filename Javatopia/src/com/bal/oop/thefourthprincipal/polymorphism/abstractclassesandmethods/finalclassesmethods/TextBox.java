package com.bal.oop.thefourthprincipal.polymorphism.abstractclassesandmethods.finalclassesmethods;

/*
declare as final
and now cannot declare a class that extends  the check box
 */
public final class TextBox extends UIControl{
    @Override
    public void render() {
        System.out.println("render text box");
    }

    //final method
    /*
    ctrl + o > we can not see enable method anymore. Because it's declared as final. So we use final methods in
    situations where we have made certain assumptions. they are changing the state of the class in the particular way.
    We don't want the subclasses to accidentally change the behavior or wreck our assumptions.
     */
}

/*
we get a compilation error
> cannot inherit form the final class
 */
//public class MyCheckBox extends TextBox {
//
//}
