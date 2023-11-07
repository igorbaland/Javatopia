package com.bal.advanced.generics.genericclassesandinheritance.wildcards;

public class GenericList<T> {
    private T[] items = (T[]) new Object();
    private int count;

    public void add(T value) {
        items[count++] = value;
    }

    public T get(int index) {
        return items[index];
    }


}
