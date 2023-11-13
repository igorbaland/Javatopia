package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.functionalinterface;

import java.util.function.Function;

public class ComposingFunctionDemo {
    /*
    We can compose small functions to build more complex and interesting functions. Let's say we have a string and this
    format:
        "key:value"
        that we want to pass the string through two transformation
            1. replace with the equals assign
            "key:value" to "key=value"
            2. We want to add curly bracers around the string
            "{key=value}"
    We are going to declare two small functions. And then we are going to compose them to build a larger, more complex
    function

    There are two ways to compose functions
        1. Declarative programming
        var result = replaceColon.andThen(addBracers).apply("key:value");
        System.out.println(result);
            > instead of writing instructions to
                > how we should do something, we express
                    > what needs to be done with details or somewhere else.
        We have a bunch of small reusable functions and we are composing them to build something more complex.
        When we are writing code like above, it's better to reformat code like this:
            var result = replaceColon
                            .andThen(addBracers)
                            .apply("key:value");
            System.out.println(result);
        We put statement on a new line that reads better.
        2. We also have another method called
            > compose. Compose is similar to andThen() but  it changed this function in the
                > reverse order. If we want to achieve the same result, using the compose() method, we should write code
                We start with the second function
                    addBracers
                        .compose(replaceColon)
                        .apply("key:value");
                We get the same result as before
     */
    public static void show() {
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBracers = str -> "{" + str + "}";

        var result = replaceColon
                            .andThen(addBracers)
                            .apply("key:value");
        result = addBracers
                .compose(replaceColon)
                .apply("key:value");
        System.out.println(result);
    }
}
