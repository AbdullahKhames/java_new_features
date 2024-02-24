package java_new_features.java11;

import jakarta.validation.constraints.Min;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String s = "   ";
        System.out.println(s.isBlank());

        Function<Integer, Integer> demo = (@Min(value = 10) final var a) -> a + 20;

        System.out.println(demo.apply(5));

    }
}
