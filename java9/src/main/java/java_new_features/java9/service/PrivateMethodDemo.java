package java_new_features.java9.service;

public interface PrivateMethodDemo {
    private static void privateMethodExample() {
        System.out.println("Inside a private static method\n");
    }
    static void usePrivate(){
        privateMethodExample();
    }
}
