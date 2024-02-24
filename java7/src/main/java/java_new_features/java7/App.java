package java_new_features.java7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
        String filePath = "src\\main\\resources\\demo.txt";
        System.out.println(multiCatchDemo("not found") );
        System.out.println(multiCatchDemo(filePath) );


        System.out.println(getPersons());

        System.out.println(getDayNumber("SATURDAY"));
        nioWriteToFile(filePath, "edited");
        System.out.println(nioReadFile(filePath));
    }
    public static String multiCatchDemo(String filePath)
    {
        String s = null;
        FileInputStream fis = null;
        try{
//            Path path = Paths.get(filePath);
//            s = new String(Files.readAllBytes(path));
        	File file = new File(filePath);
        	fis = new FileInputStream(file);
        	s = new String(fis.readAllBytes());
        }catch (IOException | InvalidPathException ex)
        {
            System.err.println(ex.getMessage());
        }
        finally {
			try {
				if (fis !=null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return s;
    }
    public static List<Person> getPersons(){
        List<Person> personList = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "demo", "");
             PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM demo");
             ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next())
            {
                Person person = new Person(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"));
                personList.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personList;
    }

    public static byte getDayNumber(String day)
    {
        switch (day)
        {
            case "SATURDAY":
                return 0;
            case "SUNDAY":
                return 1;
            case "MONDAY":
                return 2;
            case "TUESDAY":
                return 3;
            case "WEDNESDAY":
                return 4;
            case "THURSDAY":
                return 5;
            case "FRIDAY":
                return 6;
            default:
                return -1;
        }
    }
    
    public static String nioReadFile(String filePath) {
    	Path path = Paths.get(filePath);
    	try {
			return new String(Files.readAllBytes(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return "";
    }
    public static void nioWriteToFile(String filePath, String toWrite) {
    	Path path = Paths.get(filePath);
    	try {
			Files.write(path, toWrite.getBytes("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
