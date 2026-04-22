package org.example.creational.factrory;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        IO.println("Отправка EMAIL: " + message);
    }
}
