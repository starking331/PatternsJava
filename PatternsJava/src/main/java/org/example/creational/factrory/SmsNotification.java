package org.example.creational.factrory;

public class SmsNotification implements Notification{
    @Override
    public void send(String message) {
        IO.println("Отправка SMS: " + message);
    }
}
