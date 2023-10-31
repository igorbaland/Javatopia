package com.bal.oop.thethirdprincipal.inheritance.constructor;

public class TextBox extends UIControl{
    private String text = "";

    /*
    Compilation Error, there is no default constructor available in UI Control. Because we don't have a default
    constructor without any parameters in ui control, the constructor of the text box  doesn't know what value to pass
    to this constructor.
    So here we need to explicitly call this constructor. Let me  show how to do it.
    > super()
     */
    public TextBox() {
        //very first statement inside this constructor. So if i move this over here, once again we get a compilation
        //error.
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
