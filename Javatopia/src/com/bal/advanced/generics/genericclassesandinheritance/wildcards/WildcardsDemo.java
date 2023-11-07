package com.bal.advanced.generics.genericclassesandinheritance.wildcards;

public class WildcardsDemo {
    /*
    The better way to solve the problem in the last video is by using a wild card.
     */
    public static void demo() {
//        var instructors = new GenericList<Instructor>();
        //Compilation error > restrict > now we can only pass a list of users or subtypes of user
//        Utils.printUsers(new GenericList<Integer>());
//        Utils.printUsers(new GenericList<String>());
//        Utils.printUsers(instructors);
    }
}
