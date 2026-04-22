package org.example.creational.factrory;

public class FactoryExample {
    static void main() {
        Notification emailNotification = NotificationFactory.create(NotificationType.EMAIL);
        emailNotification.send("Письмо на почту");
        Notification smsNotification = NotificationFactory.create(NotificationType.SMS);
        smsNotification.send("Вам СМС");
        Notification pushNotification = NotificationFactory.create(NotificationType.PUSH);
        pushNotification.send("Push уведомление");
    }
}
