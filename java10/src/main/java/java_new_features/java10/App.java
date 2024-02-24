package java_new_features.java10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        var fn = "abdullah";
//        var age = 28;
//        var map = new HashMap<>();
//        map.put(1, Arrays.asList(1, 2, 3, 4));
//        map.put("ahmed", Arrays.asList(1, 2, 3, 4));
//        map.put(3, fn);
//        map.put(4, age);
//        System.out.println( map);
        version();
    }
    public static void version(){
        Runtime.Version version = Runtime.version();
        System.out.println(version.feature());
        System.out.println(version.interim());
        System.out.println(version.update());

    }
}
