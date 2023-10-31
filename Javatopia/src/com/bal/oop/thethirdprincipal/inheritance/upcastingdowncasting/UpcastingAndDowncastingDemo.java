package com.bal.oop.thethirdprincipal.inheritance.upcastingdowncasting;

import com.bal.oop.thethirdprincipal.inheritance.upcastingdowncasting.TextBox;

public class UpcastingAndDowncastingDemo {
    /*
    Upcasting
    > means casting an object to one of the super types or parent

    Downcasting
    > while down casting means casting it to one of it's subtypes
     */
    public void demo() {
        var control = new UIControl(true);
        var textBox = new TextBox();
        /*
        every text box object is also a control object, because TextBox extends UIControl
        Inheritance represents and is a relationship.
        A textBox is a control. So we pass this text box object here. And this box is a control.
        We passed this object here, and this object gets automatically cast to UIControl. This is what we call
        > up casting
        This object is going to cast to it's parent, we can also change the parameter type to object. And once again you
        have upcasting because set the parameter type to object,
        public show(Object obj)
        because every textBox is also an object.

        Output: empty
        Because earlier in a text box class, we override the toString method, we change the default implementation of
        this method, and here we return the text inside our text box. At runtime, we are passing a text box object, so
        when show() > sout(control) gets executed, the tooString method of the textBox gets executed. Because at runtime
        we are dealing with a text box object. Now here is the interesting part .
         */
        show(control);
        show(textBox);

    }

    public void show(UIControl control) {
        /*
        Even though at runtime we are passing
        the textbox object here, at compile time when we are coding this method, we don't have access to any of the
        methods in our textbox. if you type contol. in a show() method, you only see the members of the control class.
        Now what if you want to work with one of the methods of the text box class. Well you need to explicitly cast
        this control to the text box, so we prefix it with  textbox, and store the result in variablen Now we can access
        all the methods declared in text box class, so let's change the text in tihs object  to hello world. now when we
        run our program, instead of an empty string, we see hello world.

        So let's quickly recap ( rekapitulieren/kurze Zussamenfassung) up to this point. Because the show method accepts
        a control object, we can give an instance of the ui control , or any of its derivatives, at compile time however
        we can only work in the members of the ui control, on this we explicitly cast this control object to a
        different type. This is what we call down casting. Now there is a problem in this implementation. What if we
        pass argument control to our show method
        show(control);
        > we don't have any compile time errors, because this method expects a ui control, and of course we are giving
        it a ui control. However, when we run our program, our program is going to crash without exception.

        >Exception in thread "main" java.lang.ClassCastException:
        class com.bal.oop.thethirdprincipal.inheritance.upcastingdowncasting.UIControl cannot be cast to class
        com.bal.oop.thethirdprincipal.inheritance.upcastingdowncasting.TextBox
        (com.bal.oop.thethirdprincipal.inheritance.upcastingdowncasting.UIControl and com.bal.oop.thethirdprincipal
            .inheritance.upcastingdowncasting.TextBox are in unnamed module of loader 'app')
	    at com.bal.oop.thethirdprincipal.inheritance.upcastingdowncasting.UpcastingAndDowncastingDemo
	        .show(UpcastingAndDowncastingDemo.java:57)
	    at com.bal.oop.thethirdprincipal.inheritance.upcastingdowncasting.UpcastingAndDowncastingDemo
	        .demo(UpcastingAndDowncastingDemo.java:33)
	        at com.bal.Main.main(Main.java:13)


        type of this exception classCastException, and her is the message:
         > class ui control cannot be cast in the text box. Here is the reason.
         var textBox = (TextBox)control;
            > we are trying to cast a control to the text box. Now this doesn't make sense to Java. Here is the reason
                > every text box, is of course a control object, but not every control is necessary for a text box. It
                could be a drop box or a check box. So that is the reason why we got an exception here, take this method
                control object with is more generic and we are trying to cast it to a more specialized type. Java cannot
                do this. So how we can prevent this error happen? Well, before this casting we need to make sure, that
                the object that's passed here at runtime is an instance of the text box class. Then we can safely cast
                it as text box. So here  we can type an if statement like this
                if (control instanceOf TextBox)
                this expression will return true if the object that we pass here
         */
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
