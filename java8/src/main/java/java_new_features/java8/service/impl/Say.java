package java_new_features.java8.service.impl;

public class Say {
    public Say(){
    }

    public Say(String s) {
        System.out.println("demo for constructor method reference");
        System.out.println(s);
    }

    public static String say(String toSay)
    {
        System.out.println("demo for static method reference");
        System.out.println(toSay);
        return toSay;
    }
    public void sayFromInstance(String toSay)
    {
        System.out.println("demo for instance method reference");
        System.out.println(toSay);
    }


}
