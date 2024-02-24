package java_new_features.java8.service;
@FunctionalInterface
public interface SayAble {
    void say(String toSay);
    default void defaultDemo(){
        System.out.println("in default");
    }
    static void staticDemo(){
        System.out.println("in static demo");
    }
}
