package com.bal.advanced.generics.typeerasure;

public class TypeErasureDemo {
    /*
    Let's see how Generics work under the hood. Let us remove the constraint type parameter Cloneable and Comparable,
    and
        > recompile our code.
            > IntelliJ, Menu > Build > Build Project
    We open the
        > project window  (packages and classes...)
    Select the GenericList > View (Menu) > Show Bytecode

    Here we can see the actual byte code that is generated as a result for compiling our Java code. Byte code is a
    platform independent for presentation of our java code. When we compile our Java code, the java compiler will
    produce this byte code that can run on different platforms, like Windows, Mac and Linux. When we run our program,
    the java virtual machine will get this bytecode and convert it to the native code for the target platform. If you
    are on this call on Windows, we have an implementation of Java virtual machine that knows how to convert this
    bytecode into native code for windows. We also have an implementation of Java Virtual Machine for Mac or Linux and
    other Operating systems.

    Why do we care about this?
    If you scroll up, you can see different pieces of the generic list class. For example,
    we have our two private fields:
        private [Ljava/lang/Object; items
        private I count
    Look at the type of the items field. It is an object. More accurately it's an object array.

    Also, if we scroll down, we can see add method
        public add(Ljava/lang/Object;)V
    Look at the type of the parameter of this method. It's the object class.

    When we compile this code, the java compiler will replace all these T's with the object class. And that means,
    internally this class is implemented, like the non GenericList  that we created earlier. When we compile our code,
    our GenericList will end up looking like this bytecode. The difference these two implementations is
        > compile time safety. When we use the generic implementation, the Java compiler will check for type errors at
    compile. But internally, our integers or strings, or user objects in an
        > array of objects. This is not because we have set this field to a new Object array
            > private T[] items = (T[]) new Object();
        If you don't do this, the Java compiler will still replace all the T's with the object class.

    Let us see, what happens when we apply a constraint
        public class GenericList <T extends Number>{
    recompile our code.
    Now the type of this field is number
         private [Ljava/lang/Number; items
    Similarly, if we look at the add() method, the type of parameter has changed to number.
    When we apply constraint, the java compiler will replace all
        > these T's based on the constraint that we have set there. Our constraint is the number of a class. So all
        these T's will be  replaced with the number class.
    If we have an interface, let's say comparable, all these T's will be replaced the comparable interface.

    What if we have 2 x constraints like Cloneable and Comparable
        public class GenericList <T extends Comparable & Cloneable>{
    Let's take a look, recompile the code.
    The type of the items field is comparable:
        > private [Ljava/lang/Comparable; items
    And similarly, the type of parameter of the method is comparable
        > public add(Ljava/lang/Comparable;)V

    Whe we have multiple interface constraints, the java compiler will take  the
        > leftmost one and use that to replace all these T's
    This is called
        > TYPE ERASURE
        which means the Java compiler erases this type parameters and replaces them with a class or an interface
        depending on the constraints. If there are no constraints, all these T's are replaced with the object class.
        This is how generics work under the hood.

     */
    public static void demo() {

    }
}
