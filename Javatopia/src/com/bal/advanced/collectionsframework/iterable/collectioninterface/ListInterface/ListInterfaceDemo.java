package com.bal.advanced.collectionsframework.iterable.collectioninterface.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfaceDemo {
    /*
    The list interface represents an order collection also called a sequence. With List, we can access objects by their
        > INDEX. In collections, we don't care about the index of objects, we just care about
            > adding
            > remove from the collection.
    So in oir applications, if you want to work with an ordered collection, you care about the index of objects and a
    collection, you should use the list interface.
     */
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        /*
        We can't do this with collection interface, because collection don't support indexes
         */
        list.add(0, "!"); // add at 0, but move all indexes +1 (don't replace a with !)
        System.out.println(list);
//        list.subList(0, 2);     //from param.index (inclusive) to param.index (exclusive).
//        list.indexOf("a+"); // if element does not exist > return -1
//        list.set(0, "a+");  // equal add()
//        var getByIndex = list.get(0);

    }
}
