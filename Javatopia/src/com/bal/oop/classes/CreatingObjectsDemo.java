package com.bal.oop.classes;

public class CreatingObjectsDemo {

    public void demo() {
        //using a var keyword, we can write shorter and cleaner code. We let the java compiler determine the type of
        //this variable
        var textBox1 = new TextBox();
        //now we use the . operator to look at the members of this class.

        //reference type, by default return null
        //primitive types, by default return 0 or boolean false

        textBox1.setText("Box 1");

        //reference by default can crash our program:
            //> NullPointerException: Cannot invoke "String.toUpperCase()" because "textBox1.text" is null
            //> most popular Exception in java
            // here we are trying to call method toUppercase on an object that doesn't exist
            // to prevent NullPointerException, we can initialize our string to empty string
                // Class TextBox > field text = "";
            // > never be null
        System.out.println(textBox1.text.toUpperCase());

        // these objects aree completely independent of each other.
        /*
        they:
        > have different data, are in different state
         */
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }

    //new operator > create a new instance of the textbox class

    //TextBox repeated twice here. this is making our code a little bit noisy. We can simplify this using the var
    //keyword in java. So we can replace the first TextBox wit a var. And the java compiler will detect the  type
    //of this variable.
    // var textBox = new TextBox();
    //TextBox textBox = new TextBox();

}
