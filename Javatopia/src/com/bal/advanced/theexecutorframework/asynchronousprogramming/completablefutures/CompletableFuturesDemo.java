package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures;

public class CompletableFuturesDemo {
    /*
    Throughout of this section, we are going to talk about a very important type called
        CompletableFeature<T> class
            As we can see, this class implements the interfaces
                CompletionStage<T>
                Future<T>
    Every CompletableFuture is a future object. The reason this is called completableFuture is that we can explicitly
    complete a future object. This is not something that we can do with future interface.

    CompletionStage
    This interface represents a stage of a possibly asynchronous operations. In the real world , quite often an
    asynchronous operation involves many steps. For example,
        1. we may call a remote API to get some data
        2. we want to transform the data into a different structure
        3. finally we want to write the data into a database
    This interface represents a step or a stage of an asynchronous operation and it gives us a  bunch of methods for
    combining and composing the steps in a declarative way. Kind of like how we use this stream API to build a complex
    query in a declarative way. Earlier, we use the map, filter and reduce to build a complex query. We can do the same
    thing with
        CompletionStage<T> interface.
     */
}
