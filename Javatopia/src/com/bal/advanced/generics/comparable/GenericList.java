package com.bal.advanced.generics.comparable;

public class GenericList <T extends Comparable>{
    private T[] items = (T[]) new Object();
    private int count;

    public void add(T value) {
        items[count++] = value;
    }

    public T get(int index) {
        return items[index];
    }
}
