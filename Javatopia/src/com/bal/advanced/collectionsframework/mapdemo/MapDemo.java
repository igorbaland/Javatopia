package com.bal.advanced.collectionsframework.mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    /*
    List<Customer> customers = new ArrayList<>();
    for(var customer : customers)
        if(customer.getEmail() == "e1")
            System.out.println("Found!");
    This algorithm  is not scalable. Because the more objects we have in this list, the longer this loop is going to
    take. We are going to need more comparisons. In the WORST CASE SCENARIO, if this customer/object we are looking for
    is at the end of the list, we have to iterate
        > the entire list to find that customer.

    In computer science, we represent the cost of this algorithm using a special notation
        > O annotation
            > O(n)
                > n is the number of items of our list
                if we have, let's say 10 items in list, the cost of this algorithm is going to be of 10
                    > O(10)
                Because in the worst case scenario, this customer we are looking for is at the end of the list. So we
                need it 10 comparisons to find the customer. What if our list have 1_000_000 customers, then the cost
                of this algorithm is going to be all of 1 million.
                    > O(1_000_000)
                The cost of this algorithm increases linearly and indirect proportion with the size of the input. That
                is why we represented using O of n.

    HashTable
    This is where HashTables come to rescue. A HashTable is a special
        > data structure, we can use it to store data like a bunch of customers.
            > But the way HashTables stores data is different from
                > list
                > array
            For this varies and with a HashTable, we can quickly look on an object, no matter how many objects we have
            stored in the HashTable. Whatever we have 10 or 1_000_000 customers. We can find a customer using only
                > one comparison and represented using the
                    > O(1)
    Technically, there is no comparison involved when we look up an object using a HashTable, but you can think of it as
    a small computation step.
    Detailed documentation about HashTable in design patterns

    Map
    In Java, we have an interface called
        > Java: Map       Python/C#: Dictionary         JavaScript: Objects
            which represents
                > HashTable


    Use interface map in Java
    This is a part of collection package
        > but is not part of iterable, collection hierarchy
            > it's not collection, it's not iterable. Something entirely different
    This interface has generic type parameters, K and V. With a map, you are essentially mapping a key to value.
        > value could be an object like a customer.
        > key is something that we use to look up that customer
    Let us say, we want to look  up customers by their email.
    Below implementation:
        > So instead of using a loop to iterate over a list, we call the get() method of the hashmap to get an object.
        This is
            > extremely fast, it doesn't matter how many objects we have in this hashmap. We could have 1 trillion
            objects, the cost of finding a customer is constant and will be very small.

    What if we look for customer that doesn't exist in this list. Let's say e10
        > return null
    Similar method getOrDefault
        > return customise customer, replace null
            var unknown = new Customer("Unknown", "");
            var customer = map.getOrDefault("e1", unknown);

    containsKey
        > return boolean
        var exists = map.containsKey("e1");

    interface called Map
        > because it maps a key to a value
            > C# and Python called dictionary
                > because it's kind of like a dictionary, where we have words and  their meanings.
        > each piece of data
            > key and value
        > map is not iterable object, we cannot use it a foreach loop. So

    How can we find the objects, we have stored in a map?
    We have three methods:
        > keySet()
            > returns the list of keys
                > iterable
                for (var key : map.keySet())
                    System.out.println(key);
        > entrySet()
            > return Set<String, Customer>
                > because Set are iterable, we can iterate over them using a foreach loop
                for (var entry : map.entrySet())
                    System.out.println(entry);
                    Output: e1=a
                            e2=b
                        > we can also get only the values or keys
                            > entry.getValue()
                            > entry.getKey()
        > values()
            > return collection of Customers
                > iterable
                    > for (var customer : map.values())
                        System.out.println(customer);
                            > a
                              b
                                    > the order of these customers is not
                                        > guaranteed exactly like our Set




    */
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        for (var customer : map.values())
            System.out.println(customer);
    }
}
