package com.bal.advanced.collectionsframework.iterable;

public class IteratorInterfaceDemo {
    /*
    In this section we are going to complete our implementation of the iterator method in our GenericList class. As you
    can see this method returns an Iterator object
        @Override
        public Iterator<T> iterator() {
            return null;
        }
    This iterator is actually an interface declared in
        > java.util package. On the documentation, we can see the four methods declared in this interface. Two methods
            > remove() and
            > forEachRemaining(Consumer <? super E>) has a default implementation we don't have to worry about them.
    The only two we have to implement are
            > hasNext()
            > next()
            Which we saw in the last section

    Now we should declare a new class that implements the iterator interface. Back to our GenericList
     */

    public static void demo() {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item : list)
            System.out.println(item);
    }
}
