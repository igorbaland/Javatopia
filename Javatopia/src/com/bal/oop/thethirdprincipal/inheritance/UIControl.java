package com.bal.oop.thethirdprincipal.inheritance;

public class UIControl {
    /*
    What behaviors do we want to define here?
    For this demo, let's add the ability to enable or disable each ui control.

     */
    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }
    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
