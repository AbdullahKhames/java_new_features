package java_new_features.java8;

import java_new_features.java8.service.NotificationSender;
import java_new_features.java8.service.impl.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
//        SAMAndAnnonyomousInnerClasses();
//        functionalInterfaceWithLambda();

        // referring to static method
//        SayAble staticSayable = Say::say;
//        staticSayable.say("hello world");
//
//        Say say = new Say();
//        SayAble instanceSayable = say::sayFromInstance;
//        instanceSayable.say("hello from instance");
//
//
//        SayAble constructorSayable = Say::new;
//        constructorSayable.say("hello from constructor");

//        usingForEach();
//        System.out.println(USPToEGP(10.0));
        System.out.println(composeDemo(100.0));
    }

    public static Double EGPToUSD(Double egp){
        Function<Double, Double> converter = (x) -> {
            return x / 65;
        };
        return converter.apply(egp);
    }
    public static Double USPToEGP(Double usd){
        Function<Double, Double> converter = (x) -> {
            System.out.println("called apply");
            return x * 65;
        };
        return andThenDemo(converter, usd);
    }
    public static Double andThenDemo(Function<Double, Double> first, Double usd){
        Function<Double, Double> after = (x) -> {
            System.out.println("called and then");
            System.out.println(x);
            return x + 20;
        };
        return first.andThen(after).apply(usd);
    }
    public static Double composeDemo(Double usd){
        Function<Double, Double> before = (x) -> {
            System.out.println("called before");
            return x + 20;
        };
        Function<Double, Double> converter = (x) -> {
            System.out.println("called after");

            return x * 65;
        };

        return converter.compose(before).apply(usd);
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

    public static void usingForEach() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integers.forEach(Demo::adder);
    }
}
