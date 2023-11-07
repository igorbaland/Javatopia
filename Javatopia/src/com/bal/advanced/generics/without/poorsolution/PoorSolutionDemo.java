package com.bal.advanced.generics.without.poorsolution;

public class PoorSolutionDemo {
    /*
    One way to solve the problem without generics is to use an area of OBJECTS here. Because the object class is the
    base or the parent of all references types in java. Remember reference times? To refresh memory, we have 2
    categories of types in java, primitive and references types. Primitive are numbers, booleans and characters.
    Everything else is a reference type. If we use an area objects here, we can store anything in this array. For
    example, we can store user objects, because the user class extends the object class.
     */

    private Object[] items = new Object[10];
    private int count;

    public void add(Object value) {
        items[count++] = value;
    }

    public Object getByIndex(int index) {
        return items[index];
    }
}
