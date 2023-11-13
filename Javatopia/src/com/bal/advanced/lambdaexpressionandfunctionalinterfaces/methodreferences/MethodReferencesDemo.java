package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.methodreferences;

public class MethodReferencesDemo {
    /*
    Sometimes all we do in a lambda expression is passing the parameter or parameters to an
        > existing method. For example, we are simply passing this message to the println() method of this object. In
    this case, it is easier to reference this method directly.
        1) We type the name of class or the object that containt this method.
        2) We type typ double colons
        3) Follow by the name of the method without parenthesis, because we don't want to call this method, we just want
            to add a reference to it. For example, if we want to rewrite this lambda expression using a method reference
            we will type greed. What is the object that contains the println() method
            > System.out::println (method without parentheses)
            > Class/object::method

    > greet(System.out::println);        this call is identical to
    > greet(message -> System.out.println(message));

    With intelliJ, we can always convert this kind of lambda expression to a matter of reference very easily.
        > cursor over lambda expression
            > alt + enter
                > replace lambda with method reference

    With this method references, we can reference static or instance methods in the class, as well as constructor.
        greet(message -> print(message));
        greet(MethodReferencesDemo::print);

        //static + instance method
        var demo = new MethodReferencesDemo();
        greet(message -> demo.print(message));
        greet(demo::print);

    What about passing a value to a constructor?
        greet(message -> new MethodReferencesDemo(message));
        greet(MethodReferencesDemo::new);

    With method references we can write compact and easier to read lambda expressions

     */

    public MethodReferencesDemo(String message) {
    }

    public void print(String message) {

    }

    public static void demo() {
       greet(MethodReferencesDemo::new);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
