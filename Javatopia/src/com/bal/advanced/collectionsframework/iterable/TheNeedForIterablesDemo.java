package com.bal.advanced.collectionsframework.iterable;

public class TheNeedForIterablesDemo {
    /*
    The iterable interface  is at the top of our hierarchy. Now more accurately, this interface is not part of the
    collection framework. In fact, it's part of
        > java.lang package
    So, it's one of the fundamental interface in java and represents an object that we can iterate or loop over. Before
    we look at the specifics of this interface, let's talk about the problem it tries to solve.
     */

    public static void demo() {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        /*
        we have a compilation error
            > foreach not applicable to type ...GenericList
        One way to solve this problem is to go back to the GenericList class and make this private field
            > private T[] items = (T[]) new Object[10]        //to public.
            Then we will be able to access this items array from outside of this class.
             for (var item : list.items)
                System.out.println(item);

            The problem with this approach is that we have exposed the internal implementation of this class to the
            outside. If you decide to  change this implementation in the future, and replace this array with a different
            data structure, all the code that is dependent on this field will have  to change.
                > II OOP principle > abstraction(Implementation detail)
        As a metaphor, think of the remote control of TV. This remote control has a few simple buttons for you to work
        with. But on the inside , it has a complex logic board. That is the implementation detail, that if you tomorrow
        the manufacturing company decide to change this internal implementation, you are not going to get affected. If
        they replace a transistor with an advanced model, you can still use the same buttons you are familiar with. The
        changing the internal implementation of a remote control should not impact its public interface. In OOP, we
        should design our classes in the same way. We talked about this concept  a lot in OOP package.

        The problem with public fields
        With this implementation details and write code like this
                list.items[0] = "a";
                System.out.println(list.items.length);
            > What is the problem here?
                > there is no problem right now. But if tomorrow we decide to replace this array with an ArrayList
                object, our code is going to break. Let show
                public ArrayList<T> items = new ArrayList <>();
                This is the class declared in a collection framework. It's implementation of a dynamic array. We are
                going to look at it soon...
                In our main method, our code broke. Because the ArrayList class does not support
                    > the square bracket syntax for accessing an object by its index.
                Also, it doesn't have a field called
                    > length
                A simple change in the implementation detail of our generic list, resulted into breaking changes in our
                demo() method. This is a very simple program. But in arel application, we could have hundreds of
                references to our GenericList. If change the implementation detail, then we will have go back and fix
                all those hundreds of places that are broken.

        Here is the question, how can we iterate over a list without knowing anything about its internal implementation?
        That is where the iterable interface come to the rescue.

         */
        list.items[0] = "a";
        System.out.println(list.items.length);

    }
}
