package com.bal.oop.interfacesdemo.interfaces.segregationprincple;

public class Dragger {
    /*
    let's imagine we use this class to drag an object on the screen
     */
//    public void drag(Draggable draggable) {
      public void drag(UIWidget uiWidget) {
        /*
        with this implementation, our Dragger class is coupled or dependent on the ui widget interface. So it's coupled
        to this contract.
        Here is the problem
        > if we change the signature of the resize() method in UIWidget interface, for example we add a new parameter
        resize(int size). Our dragger class will affected and has to be recompiled even though it's not using this
        capability. It doesn't care about resizing ui widgets. Now here we are dealing with a relative small interface,
        but we have
        > mixed different concerns or capabilities. Now what if we had an interface with 10 or 20 methods. That
        interface could change for several reasons. Every time we change that interface or contract all the classes that
        are dependent on that interface, as well as their dependencies, may get affected.

        This is where the interface segregation principle come to the rescue. It says that we should divide this
        interface into smaller ones, each interface should be focused on a single capability. So here we are dealing
        with different capabilities: resize(), drag(), render().

         We should to extract a new interface and move these there...

         We are no longer going to work with the UIWidget interface , we are going to work with draggable interface
         */
//        widget.drag();
        /*
        We have only drag member. So this interface is very light. We have only one coupling point. In contrast, if we
        had a big interface with 10 methods, you would have 10 coupling points.
         */
        uiWidget.drag();
        System.out.println("Dragging done");
    }
}
