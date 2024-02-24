package java_new_features.java8;

import java_new_features.java8.service.NotificationSender;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        SAMAndAnnonyomousInnerClasses();
        functionalInterfaceWithLambda();
    }

    public static void SAMAndAnnonyomousInnerClasses(){
        NotificationSender emailNotification = new NotificationSender() {
            @Override
            public void notify(String notificationBody1, String to1, String from1) {
                StringBuilder sb = new StringBuilder(notificationBody1.length() + to1.length() + from1.length());
                sb.append("sending notification ")
                        .append(notificationBody1)
                        .append(" via email from ")
                        .append(from1)
                        .append(" to ")
                        .append(to1);
                System.out.println(sb);
            }
        };
        NotificationSender SMSNotification = new NotificationSender() {
            @Override
            public void notify(String notificationBody1, String to1, String from1) {
                StringBuilder sb = new StringBuilder(notificationBody1.length() + to1.length() + from1.length());
                sb.append("sending notification ")
                        .append(notificationBody1)
                        .append(" via SMS from ")
                        .append(from1)
                        .append(" to ")
                        .append(to1);
                System.out.println(sb);
            }
        };
        emailNotification.notify("your order was accepted", "user@gmail.com", "company@gmail.com");
        SMSNotification.notify("your order was accepted", "011111125", "011231456416");
    }
    public static void functionalInterfaceWithLambda(){
        NotificationSender emailNotification = (notificationBody1, to1, from1) -> {
            StringBuilder sb = new StringBuilder(notificationBody1.length() + to1.length() + from1.length());
            sb.append("sending notification ")
                    .append(notificationBody1)
                    .append(" via email from ")
                    .append(from1)
                    .append(" to ")
                    .append(to1);
            System.out.println(sb);
        };
        NotificationSender SMSNotification = (notificationBody1, to1, from1) -> {
            StringBuilder sb = new StringBuilder(notificationBody1.length() + to1.length() + from1.length());
            sb.append("sending notification ")
                    .append(notificationBody1)
                    .append(" via SMS from ")
                    .append(from1)
                    .append(" to ")
                    .append(to1);
            System.out.println(sb);
        };
        emailNotification.notify("your order was accepted", "user@gmail.com", "company@gmail.com");
        SMSNotification.notify("your order was accepted", "011111125", "011231456416");
    }
}
