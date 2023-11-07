package com.bal.advanced.generics.classes;

public class GenericList<T> {
    /*
    We want this class to be generic, so we can reuse it to store different types of objects.
    We type angled brackets, inside this angled brackets  we type a capital T.
        <T>
    T is as a short for type or template. We can use any letters here, it doesn't have to be a T, but T is common
    convention.
    Another convention is
        <E>
    as a short for Element. We use that when we want to implement a class that acts as a
    Collection. We can store many elements.

    This T is a type  parameter for this  class, just like our methods can have parameters, our classes can have
    parameter as well. This T represents  the type of objects we want to store in this list. When we create an instance
    of this class, we will have to specify an argument or a value for this parameter.
    For example, back to our DemoMain class...

    This T represents the type of objects we want to store. Now we need an array of type T.

    Let's create an array of type T
    Now here we have a compilation error:
         > private T[] items = new T[];
         because Java compiler doesn't know  the type of T at this stage. Is that the character or string class?... It
         doesn't  know what it is. That is why it cannot instantiate it. Now one simple workaround is to use a new
         object right here.
            > private T[] items = (T[]) new Object[10];

    Back to our  demoMain class
     */
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
