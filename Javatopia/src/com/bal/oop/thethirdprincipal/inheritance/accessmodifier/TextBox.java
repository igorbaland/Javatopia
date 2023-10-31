package com.bal.oop.thethirdprincipal.inheritance.accessmodifier;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox() {
        super(true);
        /*
        private fields and methods are not inherited by subclasses, and they are not accessible of a class.
         */
        System.out.println("Text box");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
