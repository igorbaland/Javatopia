package com.bal.advanced.collectionsframework.iterable.collectioninterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionInterfaceDemo {
    /*
    The next interface we are going to talk about is the collection interface, which represents an object that acts as a
    collection or a container for other objects.

    What are the operations that we need to work with a collection?
        > add() an object
        > remove()
        > contains() and so on...
    These are the operations that the collection interfaces declares.
    The collection interface is also generic interface, because we have a generic type parameter. But instead of T we
    have E, which is short for Element. This is common convention for declaring interfaces or classes that have a
    collection semantic, because the collection can have multiple elements.

    This interface extends iterable interface. Every collection is also iterable. That means, we can use a foreach loop
    to iterate over all collections in Java.

    All known implementing classes:
        > concrete classes, that implement this interface, over 20 classes. Most of the time, like 90% of the time,
        you only need to use the
            > ArrayList class
        The other implementations are for special purposes, and we are not going to core them.
     */
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a", "b", "c");
        var objectArray = collection.toArray();
        System.out.println(collection);

    }
}
