package com.bal.oop.classes;

//modifier
public class TextBox {
    //to prevent NullPointerException, we can initialize our string to empty string
        // > never be null
    public String text = "";  //Field

    public void setText(String text) {
        //in situations where parameter is the same as the name of a field, we can use "this" keyword.
        //this is a reference to the print object. Here  we can use the .operator to see members of this object
        // inheritance > additional functions (clone(), hashcode())
        this.text = text;
    }

    public void clear() {
        //in this case we don't really need to use this keyword, because we don't have a parameter called text
        text = "";
    }
}
