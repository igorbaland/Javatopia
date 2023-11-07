package com.bal.advanced.generics.without;

public class UserList {
    /*

     */
    private User[] items = new User[10];
    private int count;

    public void addUser(User user) {
        items[count++] = user;
    }


}
