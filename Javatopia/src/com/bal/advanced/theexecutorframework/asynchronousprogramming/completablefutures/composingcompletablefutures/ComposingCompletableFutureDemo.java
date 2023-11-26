package com.bal.advanced.theexecutorframework.asynchronousprogramming.completablefutures.composingcompletablefutures;

import java.util.concurrent.CompletableFuture;

public class ComposingCompletableFutureDemo {
    /*
    Quite often we want to start a task upon completion of another task. For example, let's say we have the
    id of a user that we want to get the user's email. We have go to our database and read the user record. With this
    we can get their email. We want to pass this email to one of those music streaming website where people their own
    playlist. We pass the email and get the playlist for given person.

        id -> email
        email -> playlist

        We have two tasks to asynchronous operations. We want to start the second task upon completion of the first
        task.  Completable futures make it really easy to implement this kind of scenarios in a declarative and
        efficient way.

        In a real world application in the body this lambda we are going to create a database. But here we just want to
        return a string. This returns a completableFuture of string
            CompletableFuture.supplyAsync(() -> "email");

        We want to start the second task upon completion, or the first task. To do that
            future.thenCompose
                that means, from this function, we should return a new completableFuture that completableFuture
                represent in new asynchronous task. What is the string that we get here? That is the email that is
                returned from our first task. we get the email. Now we want to pass this to a second task.
                    future.thenCompose(email -> )
                    Here we should return a new completable future object.
                        future.thenCompose(email -> CompletableFuture.supplyAsync()
                        here we should call the remote service, to get a playlist for this user. We pass another supply
                        object. A real application we will return a playListObject or listOfSongs
                        future.thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist");

    All we want to understand is that our first task returns an  email. Then we pass the email to our second task and
    get the playlist. When we call
        thenCompose()
            we get a new completableFuture. We can chain in other methods like thenAccept
                future.thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist")
                    .thenAccept(playlist -> System.out.println(playlist));

    Reformatting our code
        future
            .thenCompose(() -> CompletableFuture.supplyAsync(() -> "playlist")
            .thenAccept(playlist -> System.out.println(playlist));

    Let's improve this code further
    Technically we don't need a future variable, we can immediately call this method on the object return above.
        CompletableFuture.supplyAsync(() -> "email")
            .thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist")
            .thenAccept(playlist -> System.out.println(playlist));

        In a real application
            //User
            public static String getUserEmail() {
            }
                public static void CompletableFuture<String> getUser() {
                    //querying a database and getting someone's email.
                    return CompletableFuture.supplyAsync(() -> "email");
                }

                It is better to use the async suffix
                    public static Completable<String> getUserEmailAsync() {}

    We are gonna to apply the same technic for the second task
        public static CompletableFuture<String> getPlayListAsync (String email) {
            return CompletableFuture.supplyAsync(() -> "playlist");
        }

    With this refactoring we no longer need the lambdas, we use a method reference

    The end result
        We are getting the email of a user and an asynchronous fashion. Then we are composing this with another
        operation for getting the playlist and finally we print the playlist.
            This is the beauty of completableFuture.
        We can build kind of complex asynchronous operations in declarative way.
     */

    public static void show() {
        getUserEmailAsync()
                .thenCompose(ComposingCompletableFutureDemo::getPlayListAsync)
                .thenAccept(System.out::println);
    }

    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlayListAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }
}
