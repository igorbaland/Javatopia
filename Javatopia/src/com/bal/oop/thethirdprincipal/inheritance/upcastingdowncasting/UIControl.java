package com.bal.oop.thethirdprincipal.inheritance.upcastingdowncasting;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("User interface control");
    }

    public void enabled() {
        isEnabled = true;
    }

    public void disabled() {
        isEnabled = false;
    }

}
