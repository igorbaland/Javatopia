package com.bal.advanced.lambdaexpressionandfunctionalinterfaces.builtinfunctionalinterfaces.predicateinterface;

import java.util.function.Predicate;

public class CombiningPredicatesDemo {
    /*
    We talked about composing functions to build more complex and interesting functions. We can also
        > COMBINE PREDICATE to build more complex predicates.

    Combine members of predicate (logical operators)
        > and   &&
        > or    ||
        > not   !
            Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasLeftBrace);
            Predicate<String> hasLeftOrRightBraces = hasLeftBrace.or(hasLeftBrace);
            Predicate<String> hasLeftNotRightBraces = hasLeftBrace.or(hasLeftBrace);
            var result = hasLeftNotRightBraces.test("{key:value}");

    > negate() return a new Predicate
        > the opposite of the first predicate
     */
    public static void show() {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        hasLeftBrace.negate();

    }
}
