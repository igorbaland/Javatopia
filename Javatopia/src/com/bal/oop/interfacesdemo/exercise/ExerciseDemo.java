package com.bal.oop.interfacesdemo.exercise;

import com.bal.oop.interfacesdemo.exercise.refactored.*;

public class ExerciseDemo {
    public void demo() {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        /*
        Creating video processor object. Now we need to pass the concrete implementations as dependencies. In this app
        we are using
        > xVideoEncoder
            > tomorrow, if we come up with a new algorithm for encoding our videos
                > we create a new class that implements that interface and injects that new object here. Our processor
                is not affected at all.
        > SQl database
            > Similarly we are using SQL database for storing the metadata about our  videos
        > Email notification
            > Let's say we are using Gmail to send emails, if we are not happy with Gmail, you can always replace it
            with different email provider.
            > Or we can use a different kind of notification channel. We can push notifications or text messages or all
            of these. Of course, if we want to support multiple notification channels, instead of passing one object
            here, we need to pass a list of notification channels.
         */
        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new SQLVideoDatabase(),
                new EmailService()
            );
        processor.process(video);
    }
}
