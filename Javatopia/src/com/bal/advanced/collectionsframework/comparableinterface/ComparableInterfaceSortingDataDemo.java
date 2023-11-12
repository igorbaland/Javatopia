package com.bal.advanced.collectionsframework.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceSortingDataDemo {
    public static void show() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b"));
        customers.add(new Customer("a"));
        customers.add(new Customer("c"));
        /*
        The customer class does not implement  the comparable interface
            reason: no instance(s) of type  variable(s) T exist, so that customer conforms Comparable
         */
        Collections.sort(customers);
        System.out.println(customers);

    }
}
