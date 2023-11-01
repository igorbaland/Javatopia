package com.bal.oop.interfacesdemo.interfaces.segregationprincple;

public interface UIWidget
        extends Draggable, Resizable {
    //examples of UI widget are textBoxes, checkBoxes, regular buttons and so on.
//    void drag();
    /*
    Let's say there are parts of our application where we need to work with this interface  and here we need all these
    capabilities in one place, we need to be able to drag, resize and render an object.
    Here we can use
    > inheritance between these interfaces we can type extends draggable. Now this UIWidget interface will inherit the
    drag method, from the draggable interface. So if you go back to the dragger class and replace this with UIWidget
    > we have all members in one place.
    So this is how we can apply the interfaces segregation principle

    Refactoring method via Intellij
    shortcut: alt + ctrl + shift +t (call refactor popup) > extract interface
    What we have now:
    > new interface Resizable, this interface is very lightweight and only has a single method, and by the way it
    doesn't mean that any time you have an interface with 3 methods >  you should segregate it > into 3 interfaces
    each with a single method.
        >>> That's not the point of this lesson. The point here,
        > is that you should segregate different capabilities. So resizing and dragging  an Object are two different
        capabilities. But we might have different ways to resize an object. For example, you might have another resize
        method that takes two parameters. Example in Resizable interface

    > UIWidget are extending
        > 2 x interfaces: draggable and resizable
            > unlike classes a Java interface can have MULTIPLE PARENTS, but this not a problem. This is not going to
            bring the problems with multiple inheritance. Because if these parents declare the same method with the
            signature, this interface will inherit only one of them. There is no ambiguity (mehrdeutig). In contrast,
            a class cannot have multiple parents, because it is possible that these parents declared a method with the
            same signature but with different implementations. We talked about it
            > in Java a class cannot have multiple parents but an interface can have multiple parents.

     */
    void render();
}
