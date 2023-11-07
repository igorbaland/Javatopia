package com.bal.advanced.generics.comparable;

public class ComparableInterfaceDemo {
    /*
    Earlier we briefly mentioned the comparable interface. We use this interface to compare two objects like two User
    objects.
    What is the benefit of this?
    A lot of
        > sorting algorithms are based on comparing objects.
    With these comparisons, we can determine what objects should come first.

    Let us see how we can use the comparable interface for comparing objects.
    On java documentation, you can see that comparable is a generic interface, because here we have a type parameter.
    If we scroll down, you can see that this interface has a single method called compareTo(T o) which takes an object.
    The type of this object is T, which is the parameter for this generic interface.

    To be able to compare to user objects, we should implement this interface in our user class.
        public class User implements Comparable<User>{
        @Override
        public int compareTo(User o) {
            return 0;
        }
    Look of the type of parameter of compareTo() method. It is user, because we pass the user.class in
        implements Comparable<User>{

    Let us show, what happens if we forget to pass this generic type argument. implements comparable without with
    generic type argument
        public class User implements Comparable{
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    Type of this parameter is an Object. instead of comparing a user object with another object, now we are comparing
    this with an instance of the object class. Early, we told about the problems with the object class. We have to do
    an explicit cast here. It is possible to get a CastingException at runtime. So this approach is unsafe. That's
        > why we should always specify the generic type argument.

    Here is the logic we should implement here.
        public int compareTo(User o) {
            return 0;
        }
    If the current User Object is less than his other user object(o), then we should return a negative value. It could
    be negative one, negative two... whatever it doesn't really matter.
    If they are equal, then we should return zero.
    If the current user object is greater than the other user object, then we should return  a positive value (it
    doesn't matter)
        this < object -> -1
        this == object -> 0
        this > object -> 1
    On what basis are we going to compare this user objects? In other words, how can we say if a user object is greater
    than another user object or not? Let us assume that we are going to compare users by their points. Later, we will be
    able to sort  users by their points. We will look at the next section.
    In user class, let us declare a private field points. We want to initialize this from constructor

    In Java we cannot write code like this
        if (user1 < user2)
    We can only use this operator to compare numbers and characters.

    To compare two user objects will have to use our comparedTo method.

     */
    public static void demo() {
        var user1 = new User(10);
        var user2 = new User(20);
        if (user1.compareTo(user2) < 0)
            System.out.println("user1 < user2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 == user2");
        else
            System.out.println("user1 > user2");
    }
}
