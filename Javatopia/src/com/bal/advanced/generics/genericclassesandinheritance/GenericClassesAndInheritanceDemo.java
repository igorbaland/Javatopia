package com.bal.advanced.generics.genericclassesandinheritance;

public class GenericClassesAndInheritanceDemo {
    /*
    We are going to talk about a common misunderstanding when it comes to programming with  generics. Continue in
    Instructor class
     */

    public static void demo() {
         /*
        we can set to a new User or a new Instructor, because an instructor is a type of user.
        If you have a variable type  of user, we can set it to an instance of the user class, or any of its derivatives,
        like the instructor class.

        Why  does this matter?
        Continue in Utils class
         */
        User user = new Instructor(10);

        /*
        here we can pass the user or instructor object
         */
        Utils.printUser(new Instructor(20));
        /*
        We can create a generic list of users  and  pass it to the method
            var users = new GenericList<User>();
            Utils.printUsers(users);
        that is perfectly fine

        But if we change the type from User to Instructor, we get a compilation error
            var instructors = new GenericList<Instructor>();
            Utils.printUsers(instructors);
        Because it genericList of instructor  is not as subtype of genericList user.
        Why is that? Earlier we talked about how this generic classes work. Under hood, we looked at thy byte code
        representation of this generic list class. This generic list internally maintains a list of objects, no matter
        what we pass here. Whatever we pass the user or the instructor class, we have only a signle generic list in our
        project. And this class is not a subtype of itself. That is the reason why it generic list of instructor is not
        a subtype of generic list of user because  we are dealing with a single class.
        How can we solve this problem here?
        One way it to convey this list to a list of users. We declare a list of users. Then we have to iterate the
        list of instructors. And add each instructor object to our list of users. Once we do that, we will be able to
        pass the list of users here. But this tedious. To solve this problem using wildcards.
         */
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
//        Utils.printUsers(instructors);

    }
}
