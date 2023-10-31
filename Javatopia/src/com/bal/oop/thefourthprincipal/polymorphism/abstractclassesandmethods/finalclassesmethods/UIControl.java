package com.bal.oop.thefourthprincipal.polymorphism.abstractclassesandmethods.finalclassesmethods;

public abstract class UIControl {

    private boolean isEnabled = true;

    public abstract void render();

    //final method
    public final void enable() {
        isEnabled = true;
    }
}
