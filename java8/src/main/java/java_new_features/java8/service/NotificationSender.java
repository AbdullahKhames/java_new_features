package java_new_features.java8.service;
@FunctionalInterface
public interface NotificationSender {
    void notify(String notificationBody, String to, String from);
}
