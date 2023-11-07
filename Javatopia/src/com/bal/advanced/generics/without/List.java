package com.bal.advanced.generics.without;

public class List {
    /*
    We shouldn't have hard code the length of  this array
        > new int [10];
        It's better to add a constructor and receive the initial capacity of this array as a parameter.
        But let's not worry about this and instead implement a basic list class.
    We need:
    > a method for adding a new manager to this list.
    > a private field for keeping a number of items
        > we initialize count is 0 and store it in items index zero
            > we should increment count
            items[count++]
            Next time we add an item, it will be stored an index one and so on.
    > a method for getting an integer by its index.
        > not validating this index parameter, not checking to see if it is negative or greater than the number of items
        Let us no worry about these details and focus on the absolute basic implementation of a list.
     */
    private int [] items = new int [10];
    private int count;

    public void add(int item) {
        items[count++] = item;
    }

    public int get(int index) {
        return items[index];
    }
}
