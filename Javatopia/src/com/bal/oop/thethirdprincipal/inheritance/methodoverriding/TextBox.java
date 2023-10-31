package com.bal.oop.thethirdprincipal.inheritance.methodoverriding;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("Text box");
    }

    /*
    @ sign followed by override > an annotation.
    An annotation is basically a label that we attach a class member. And with this we get extra information to the java
    compiler. So with this were telling the java compiler, that we are overriding the two string method declared in the
    object class. And with this the java compiler will check the signature of this method, it will make sure that this
    method has the same exact signature. Now here we have a compilation error, because the two string method that is
    declared in the object class returns a string, but here we are using void. So that is the benefit of using this
    annotation, it helps the Java for correctness.
     */
    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
