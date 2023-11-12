package com.bal.advanced.collectionsframework.iterable.collectioninterface.setInterface;

import java.util.*;

public class SetInterfaceDemo {
    /*
    This interface represents a collection that contains no duplicates. It's a great way for storing
        > a list of unique values.
    HashSet is one of implementations of the set interface that you use 90% of the time.

    The duplicate is gone
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);
    But look at the order of items, we have sky, blue and is. The Set interface does not
        > guarantee the order of items. That is one of the important characteristics of the set interface, we need to
        understand. Do not rely on the order
        > only guarantees the uniqueness

    Let us say we have a collection of items and we want to remove the duplicates. Using a set, we can do it in one line
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);

    HashSet constructor
        ctrl+p
    This constructor is overloaded three times.
        > Collection<? extends String> c
            > unknown (wildcard), that means we can pass
                > collection of string or
                > any type that extends the collection interface. For example:
                    > List<String>
                    > Queue<String>
                    > Set<String>


    Set operations
        > UNION
            which is the combination of 2 sets. If we want to combine these 2 sets
                set1.addAll(set2);
                System.out.println(set1);
        > INTERSECTION
            that will give use the items that are common in both sets.
                set1.retainAll(set2);
                    this method will return or keep all items in set2, and remove everything else from set1
        > DIFFERENCE
            We want to know what items we have in the first set that we do not have in the second set.
                set1.removeAll(set2);

    new HashSet<>();
        > this time instead of a collection, we want to pass a list of string, but we don't have a list yet.
            > one way is to create the list:
                List<String> list...
                Set<String> set1 = new HashSet<>(list);

            > a better/faster way
                Set<String> set1 = new HashSet<>(Arrays.asList());
                    > here we can pas zero or more arguments

     */
    public static void show() {
        Set<String> set1 =
                new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set2 =
                new HashSet<>(Arrays.asList("a", "b", "c", "d"));

        set1.removeAll(set2);

        System.out.println(set1);
    }
}
