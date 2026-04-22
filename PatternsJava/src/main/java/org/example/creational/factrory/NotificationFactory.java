package org.example.creational.factrory;

public class NotificationFactory {
    private NotificationFactory() { }
    public static Notification create(NotificationType type) {
        if (type == null) {
            throw new IllegalArgumentException("NotificationType cannot be null");
        }

        return switch (type) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SmsNotification();
            case PUSH -> new PushNotification();
        };
    }
}
