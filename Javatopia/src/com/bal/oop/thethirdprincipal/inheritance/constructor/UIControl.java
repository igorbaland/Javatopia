package com.bal.oop.thethirdprincipal.inheritance.constructor;

public class UIControl {
    private boolean isEnabled = true;

    //alt + paste > generate
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    private void enable() {
        isEnabled = true;
    }
    public void disable() {
        isEnabled = false;
    }

}
