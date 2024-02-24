package java_new_features.java8.service.impl;

public class Demo {
    private static int sum = 0;
    public static int adder(int i)
    {
        sum += i;
        System.out.println(sum);
        return sum;
    }
}
