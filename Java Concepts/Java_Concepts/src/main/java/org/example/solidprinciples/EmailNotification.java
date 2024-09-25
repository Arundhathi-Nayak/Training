package org.example.solidprinciples;

public class EmailNotification implements Notification {
    @Override
    public void notification(String message) {
        System.out.println("Email: "+message);
    }
}
