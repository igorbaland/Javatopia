package com.bal.advanced.generics.constraints;

public class User implements Comparable, Cloneable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
