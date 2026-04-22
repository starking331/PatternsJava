package org.example.creational.factrory;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        IO.println("Отправка PUSH: " + message);
    }
}
