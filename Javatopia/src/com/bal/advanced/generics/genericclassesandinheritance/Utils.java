package com.bal.advanced.generics.genericclassesandinheritance;

public class Utils {


    public static void printUsers(GenericList<User> users){
        //don't worry about the implementation
    }
    /*
    Since we get a user here, we can pass an instance of the user class or any of this derivatives
     */
    public static void printUser(User user) {
        System.out.println(user);
    }

    public static<T extends Comparable<T>>T max(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }
}
