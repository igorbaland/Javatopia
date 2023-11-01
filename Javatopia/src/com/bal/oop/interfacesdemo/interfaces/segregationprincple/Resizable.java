package com.bal.oop.interfacesdemo.interfaces.segregationprincple;

public interface Resizable {

    void resize();

    /*
    For example , you might have another resize method that takes two parameters. Or you might have another method like
    resizeTo and give it a ui widget. So we can resize an object to match the size of another object. As you can see,
    all these methods are
        > around the same capability.
     */
    void resize(int x, int y);
    void resizeTo(UIWidget widget);
}
