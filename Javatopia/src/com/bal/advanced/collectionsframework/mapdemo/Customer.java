package com.bal.advanced.collectionsframework.mapdemo;

public class Customer {
    private String name;

    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name;
    }
}
