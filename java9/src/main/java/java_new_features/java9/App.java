package java_new_features.java9;

import java_new_features.java9.service.PrivateMethodDemo;

import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    static List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 10, 70, 80, 90);
    public static void main( String[] args )
    {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        PrivateMethodDemo.usePrivate();
//        System.out.println( "Hello World!" );
//
//        try {
//            useTryWithResources();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        takeWhileDemo();
        System.out.println("***********************************************************");
        dropWhileDemo();
        System.out.println("***********************************************************");
        ofNullableDemo();
    }

    public static void useTryWithResources() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "demo", "");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM demo");
        ResultSet resultSet = preparedStatement.executeQuery();
        try (connection; preparedStatement; resultSet){
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        }
    }

    public static void takeWhileDemo(){
        numbers.stream().takeWhile(x -> x < 50).forEach(System.out::println);
    }
    public static void dropWhileDemo(){
        numbers.stream().dropWhile(x -> x < 50).forEach(System.out::println);

    }
    public static void ofNullableDemo(){
        System.out.println(Stream.ofNullable(null).collect(Collectors.toSet()));
    }
}
