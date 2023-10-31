package com.bal.oop.thefourthprincipal.polymorphism.abstractclassesandmethods;

public abstract class UIControl {
    private boolean isEnable = true;

    /*
    we can also declare this method  as abstract and this
    > will force any classes that derive from ui control to IMPLEMENT THIS METHOD.
    > abstract method doesn't have body (curly braces)/implementation. All we have here is the method declaration, but
    not the implementation.

     */
    public abstract void render();

    public void enable() {
        isEnable = true;
    }

    public void diable() {
        isEnable = false;
    }
}
