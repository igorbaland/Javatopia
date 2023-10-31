package com.bal.oop.thesecondprinipal.coupling.reducing;

public class BrowserDemo {
    public void show() {
        //shortcut for create object
        //> new Browser > introduce local variable > replace with var
        var browser = new Browser();
        /*
        look at the members of this browser object . We have three methods. In this application our main class doen't
        really care about findIpAddress and httpRequest. These are implementation details. All we want to do in this
        main class is to navigate(..) to a web address. So two methods are unecessary, and they are polluting
        the interface of this class. Just like remote control with so many buttons, we want to hide this from the
        outside.
         */

        /*
        Now we only have the navigate method (other methods are inherited automatically)
        An interface of this object is much simple, we're going have less coupling in the future because this main class
        is not going to accidentally call one of these methods in this browser class. Like httpRequest or findIpAddress.
        If tomorrow we decide to change any of these methods, our main class is not going to get affect.
        For example, add additional parameter cache:boolean to findIpAddress in browser class. Because this method is
        only used internally inside this class, our main class is not affected.

        good code design (OOP)
        > coupling
        > impact of changes
        > abstraction
            >  Abstraction principle we want to reduce the complexity of hiding unnecessary details.
        > a way of thinking
        > a way of building software



        only classes with fields and method ARE NOT OOP.
         */
        browser.navigate("/home");

    }
}

