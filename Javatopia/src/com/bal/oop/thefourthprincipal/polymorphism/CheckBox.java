package com.bal.oop.thefourthprincipal.polymorphism;

public class CheckBox extends UIControl {

    public CheckBox() {
        System.out.println("Check box");
    }

    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}
