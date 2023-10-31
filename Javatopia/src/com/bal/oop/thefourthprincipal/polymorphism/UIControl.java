package com.bal.oop.thefourthprincipal.polymorphism;

public class UIControl {
    private boolean isEnabled = true;

    public void render() {
        /*
        for rendering control objects. Now in this method we are not going to have any implementation, because we don't
        know how to render a control, it really depends on what type of control we are dealing with, because the
        algorithm for rendering a textBox, is obviously different then the algorithm for a checkBox. So, we are going
        to leave this default implementation empty. Now we can go to each subclass this method and override this method
         */
    }

    public void enabled() {
        isEnabled = true;
    }
    public void disabled() {
        isEnabled = false;
    }
}
