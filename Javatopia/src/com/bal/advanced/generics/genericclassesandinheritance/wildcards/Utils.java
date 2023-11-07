package com.bal.advanced.generics.genericclassesandinheritance.wildcards;

public class Utils {
    /*
    Replace this type argument User with a question mark, which is called  the
        > WILDCARD CHARACTER.
        public static void printUsers(GenericList<?> users) {
    This wildcard character represents an unknown type. With wildcard we can pass the list of users, we can also pass
    a list of instructors. In fact, we can pass list of anything. For example > continue in WildCardsDemo class
     */

    //regular class CAP#1 extends User{}
    // Class Instructor extends  User {}
    public static void printUsers
            (GenericList<? super User> users) {
        /*
        Look at the return type of the get() method > is returning
            > capture of unknown
        What is this?
        When we use a wild card. the java compiler is going to create an anonymous type under the hood. So it's going
        to create a class. let's call it
            > class CAP1
        This is going a regular class in Java. We don't see it, but it's there.
        Why did we use one over
            > printUsers() method?
        Because we could have multiple wildcards here.

        The get method returns an instance of this capture class. And that means, if you get an object here, we can only
        store it in a variable of type cap or its base type. That is the object class.
            >  Object x = users.get(0);

        This is what happens when we use a Wildcard.

        How we can restrict the list that are passed here?
        We don't want to pass a list of integers or strings. We want to pass a list of users or it's subtypes. It's very
        easy to solve.
            public static void printUsers (GenericList<? extends User> users) {}
        When the java compiler sees this expression, it's going to have to capture class extend the user class. So our
        capture class was going to look like this.
             //regular class CAP#1 extends User{}
        Exactly like how the instructor class extends the user class, then you put them side by side.

        Because this capture class is a subtype of this user, we can get an object and store it in a user variable
            User x = user.get(0);
        Because the user class is the parent of the capture class. However, we can not assign this object to a variable
        of type Instructor, because Instructor and CAP are two different types. It's like assigning an integer to a
        string. There are two entirely different classes.
             Instructor x = users.get(0);

        What about adding an object that is less?
            users.add()
        Look at the parameter of this method, capture at the parameter of this method
            > capture of ? (unknown) extends User item
        Here we can pass an instance of this capture class or any of itself times. Unfortunately, we don't have access
        to this capture class. So we cannot net it up here
            user.add(new CAP) > new CAP doesn't make sense.

        With EXTENDS  keyword, we can only read from this list, we cannot add to it. If you want to add list, we should
        use SUPER keyword.
            public static void printUsers
                        (GenericList<? super User> users) {}
        When the Java Compiler sees this expression, going to treat this unknown type, like parent of the user class.
        What is the parent of the user class > the object class. So this user less is going to look like this
            GenericList<Object> temp = new GenericList<>();
        The java compiler is going to treat this object like this object.

        Now, in this list, we can add an instance of the object class or any of its subtypes.
            users.add(new Instructor(10));
            users.add(new User(10));
        Because all these types directly or indirectly derived from the object class.
        If we use the super keyword, we cannot read from this list.
        If we type user.get(0) > we can store the result in a variable of type object.
        If you want store the result in a variable of type user, we can accompish
         */
//        User x = users.get(0);
        users.add(new Instructor(10));
        users.add(new User(10));
    }
    public static void printUser(User user) {
        System.out.println(user);
    }
}
