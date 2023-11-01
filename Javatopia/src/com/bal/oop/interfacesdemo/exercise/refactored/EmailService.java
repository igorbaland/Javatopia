package com.bal.oop.interfacesdemo.exercise.refactored;

public class EmailService implements NotificationService {
    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
