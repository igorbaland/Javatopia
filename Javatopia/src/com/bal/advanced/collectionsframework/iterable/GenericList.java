package com.bal.advanced.collectionsframework.iterable;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    public T[] items = (T[]) new Object[10];

    /*
    We implement iterable of T this is also a generic interface. The iterator method is highlighted, because it's
    required method. For now don't worry about the code we are going to write in this method. We are going to come back.
    and complete this in the next section.
    All I want you to pay attention to - is the return type of this method. It returns an iterator object. Back to
    our UsingIterableInterfaceDemo class.
     */
    @Override
    public Iterator<T> iterator() {
        /*
        We are going implement this iterator as a private nested class this GenericList class.
        We declare a private class in our GenericList class called ListIterator.


         */
        return new ListIterator(this);
    }
    private int count;

    public void add(T value) {
        items[count++] = value;
    }

    public T get(int index) {
        return items[index];
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;

       /*
        How can we iterate over an array?
                > we need an index variable, initially and set it to zero, as long as the index than the number of items
                in the array we increment it.
        */
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            /*
            instead of returning false, we are going to return a boolean expression like this
             */
            return (index < list.count);
        }

        @Override
        public T next() {
             /*
            we can see the items array. And this is perfectly fine because this class is part of the implementation of
            our GenericList. If tomorrow we decide to replace this array[] with, let us say an ArrayList, this class is
            the only place where we have to make our changes because this class knows how to iterate over GenericList.
            If we replace the items array with an ArrayList, nowhere else in the code, nowhere inside the main method or
            anywhere  else we have used it GenericList - we have to make changes.
                list.items =

            index by default = 0;
            we aregoing to increment index is less than the number  of items in our list.
                @Override
                public boolean hasNext() {
                     return (index < list.count);
                }
            */
            return list.items[index++];
        }

    }

}
