package com.bal.advanced.generics.method;

public class User implements Comparable<User>{
    private int point;

    public User(int point) {
        this.point = point;
    }

    @Override
    public int compareTo(User o) {
        return point - o.point;
    }

    @Override
    public String toString() {
        return "Points= " + point;
    }
}
