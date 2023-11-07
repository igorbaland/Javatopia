package com.bal.advanced.generics.primitivetypes;

public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T value) {
        items[count++] = value;
    }

    public T get(int index) {
        return items[index];
    }

}
