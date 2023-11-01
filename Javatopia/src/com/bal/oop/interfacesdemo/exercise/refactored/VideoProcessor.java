package com.bal.oop.interfacesdemo.exercise.refactored;
/*

 */
public class VideoProcessor {
    //cursor on the class name > refactor > extract interface
    private VideoEncoder encoder;
    private VideoDatabase database;

    //NotificationService > can have the different kinds of notifications.
    private NotificationService notificationService;

    public VideoProcessor(
                    VideoEncoder encoder,
                    VideoDatabase database,
                    NotificationService notification
                ) {
        /*
        We are initializing all these fields using our constructor
        > constructor injection
         */
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notification;
    }

    /*
    Here we are no longer creating objects and as a result our implementation is simpler and cleaner. We are simply
    telling
    > encode this video
    > store to database
    > notification user

    we have completely decoupled this class from the dependencies and this give us an additional benefit, and that is
    > unit testing. So with these changes, we can test this class in isolation, without being dependent to a real
    database or real video encoder, or real email service. This is what we call unit testing. 
     */
    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.sendEmail(video.getUser());
    }
}

