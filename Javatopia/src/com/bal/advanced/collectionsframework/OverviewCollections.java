package com.bal.advanced.collectionsframework;

public class OverviewCollections {
    /*
     Collection hierarchy
     Interfaces:                            Iterable
                                            Collection
                            List            Queue               Set
     Concrete classes:      ArrayList       PriorityQueue       Hashset
                            LinkedList

     At the top of this hierarchy we have the
        > ITERABLE interface. This interface represents an object that can be used in a for each statement. If we
        implement this interface in our generic in our GenericList class, we will be able to use it in a
            > foreach loop

     Below iterable we have the
        > COLLECTION interface. This interface extends the iterable interface and add additional functionality. It
        represents an object that can act like a container or a collection of objects.  What are the capabilities that
        we need in a collection, we should be able the object
            > add()
            > remove()
            > check()
            > and... https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

    Below this collection interface, we have three sub interfaces
        > List
        > Queue
        > Set
    Each of this again, inherit all the capability declared in the
        > collection interface
        > add something extra

    We have different implementations of this interfaces in the collection framework. The one that we would be using
    most of the time is the
        > ArrayList, which is the implementation of a dynamic array. So internally, it uses an array to store objects.
        If the array gets full, it will automatically resize the array
    We have another implementation called
        > LinkList, which is based on the LinkedList data structure.
    We have two different implementation s of the List interface.

    The queue interface also extends the collection and provides additional operations for working with a
        > Queue of objects. We use Queues in situations where we have a resource that can be shared amongst many
        consumers. A good example of this is the printer at your office. Different people can print different papers
        at the same time, but a printer is not going be able to print them all simultaneously (gleichzeitig). So each
        job should go in queue. The printer will then take these jobs one by one and process them.

        >PriorityQueue class that implements Queue interface


        Set interface
        > represents a collection without duplicates.  The class that implements this interface is called
            > HashSet

    That was a very basic overview

     */
}
