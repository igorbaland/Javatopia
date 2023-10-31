package com.bal.oop.thefourthprincipal.polymorphism;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox() {
        System.out.println("Text box");
    }

    /*
    ctrl + o || alt + paste > override methods
    Now look at the beauty of this dialup box, we can see all the parent of this class and all the methods we can
    override. So here we can have all the methods that we have declared in UIControl, and below that you can see all
    methods that are declared in the object class.

    So each class has it's own algorithm for rendering, once again this is the encapsulation principle in action, so we
    are building the data and all the operations around data inside a single unit. Instead of having ten render methods
    like render textBox, render checkBox, render drop down list and so on. Every class hat it's own render method.

    Now back to the PolymorphismDemo
     */
    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {

    }
}
