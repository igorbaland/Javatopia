package com.bal.advanced.collectionsframework.iterable;

public class IterableInterfaceDemo {
    /*
    The iterable interface represents an object that is iterable. That means, we can iterate or loop over it without
    knowing anything about this implementation detail. We are using an area here. If we decide to  replace this with
    an ArrayList or a different data structure in the future, the clients of this class are not  going to get affected,
    because they are going to code against the iterable interface. Back to your remote control metaphor, think of the
    buttons for changing the volume. If the internal implementation of this remote control changes, you are not going
    to affected, you are still going to user the same buttons.  These buttons are the interfaces that you work with.

    we want to implement the iterable interface in GenericList class, and then have other classes that use our generic
    list program against the iterable interface. It's like saying that they use the volume control buttons on a remote
    control. Here is the documentation for  the iterable interface. As you can see, this interface declares three
    methods.
        The first and the last methods have a default implementation, we don't have to implement them
            > default void  >   forEach(Consumer <? super T> action)
            > default Spliterator<T> spliterator()  >   spliterator()
        The only method, that we have to implement
            > Iterator<T>   > iterator()
                Returns an Iterator object. We are going to talk about iterators in detail in the next section. But very
                briefly. An Iterator is an object that we use to iterate over an iterable. The name is confusing,
                but don't worry, I'm going to make it super simple for you.

    Back to our GenericList class...


     */

    public static void demo() {
        /*
        Now that our list implements iterable interface, we know that it has the iterator method. So we call it to get
        an iterator.
            > list.iterator();
            And with this we can iterate or loop over our list without knowing about its internal implementation. We can
            write code like this while iterator hasNext
            >  while(iterator.hasNext())
                    iterator.next();
                It's will return the current object
         */
        var list = new GenericList<String>();
        var iterator = list.iterator();
        /*
        imagine
        our list look like
            [a, b, c]
             ^
            This iterator is like a pointer that is pointing at one object. Initially is pointing at the first object.
            At the beginning of our loop. We asked, do you have more items? It says yes. So here we call the next method
            This will return the current item, which is the A, and then it will advance the Pointer to B
            [a, b, c]
                ^
            In the next iteration, we asked the iterator, do you have more items, we still do. This method will return
            true. Then we read the current item and advance the pointer.
             [a, b, c]
                    ^
            One more time we read
            [a, b, c]
                        ^
            and then iterator ends up here. So in the next iteration, what we call hasNext() method, will get false. So
            this iterator is simply an object that we use to iterate over list or more accurately, an object that is
            iterable.

            Now let me show you something really interesting. Let's compile the code. Then > show byte code. Take a look
                > We have a reference to iterator that hasNext and Iterator
                    java/util/Iterator.hasNext
                    while(iterator.hasNext()) {
                        var current = iterator.next();
                        System.out.println(current);
                    }
                And we have the same byte code representation with for each loop
                  INVOKEINTERFACE java/util/Iterator.hasNext
                    for (var item : list)
                        System.out.println(item);
            When we use the foreach loop, the Java compiler will convert our code to use an iterator object. This is the
            reason why we can iterate over this list using a foreach loop.
            If we remove implements iterable from our GenericList, we  have a compilation error saying
                > foreach not applicable to type GenericList.

            > this ist the benefit of implementing to iterable over an object without knowing anything about its
            internal implementation. Tomorrow we decide to replace this array with arrayList. Our foreach loop is not
            going to get affected. Now our implementation is not complete, we still have to implement iterator() method
            in our GenericList class. That is what we are going to do next.



         */
        for (var item : list)
            System.out.println(item);

    }
}
