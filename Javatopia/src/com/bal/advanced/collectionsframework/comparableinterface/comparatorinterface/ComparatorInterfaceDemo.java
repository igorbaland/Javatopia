package com.bal.advanced.collectionsframework.comparableinterface.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorInterfaceDemo {
    /*
    The Comparator Interface
    Comparable implementation is not very flexible, because he is always complaining customers by their
        > name.
    What if tomorrow we introduce new fields like email, address....

    That is where the Comparator interface comes to rescue. This interface is similar to the comparable interface. It is
        > generic interface. here <T> we specify the type of objects that should be compared.

    We can create a new class called of Email Comparator that compares the customers by their email.

     */
    public static void show() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));
        Collections.sort(customers, new EmailComparator());
//        Collections.sort(customers);
        System.out.println(customers);
    }
}
