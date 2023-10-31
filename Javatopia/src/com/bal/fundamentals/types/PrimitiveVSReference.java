package com.bal.fundamentals.types;

import java.awt.*;
import java.util.Date;

public class PrimitiveVSReference {

    public void versus() {
        //when jre executes var point1 = new Point(1, 1), first it's going to allocate some memory to store
        //this point object. Let's say the address of that memory location is 100.
        //then it's going to allocate a separate part of the memory and it's going to attach this label to that
        // memory location. Point 1, in that memory location it's going to store the address of our point object

        //      Point1   Point2
        //[] [] [100] [] [100]
        //        |      /
        //        |     /
        //[] [] [Point(1,1)] [] []
        //       addr: 100

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        // at different memory locations
//        byte x = 1;
//        byte y = x;
//        //change the value of x, y is not going to affect (beeinflussen) it
//        x = 2;
//        //completely independent of each other
//        System.out.println(y);
    }

    public void primitive() {
//        we don't need to allocate memory
//        memories allocate and release by java runtime environments
        byte age = 30;
        //don't have members
//        age.
    }

    public void reference() {
//        new, operator to allocate memory for this variable
//        reference types - we should always allocate memory
//        we don't have to release this memory
//        jve will automatically take care of that
//        the defined variable now - is the instance of the date class
//        these classes define templates or blueprints for creating a new objects/ new instances
//        Human -> class, object -> Bob, john ...
//        an Object is an instance of a class
        Date now = new Date();
        //these objects/classes have members, we can access using the dot operator
        now.getTime();
        System.out.println(now);
    }
}
