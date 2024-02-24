package java_new_features.java12;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        getDay(Day.SATURDAY);
        getDay(Day.WEDNESDAY);
        getDay(Day.SUNDAY);
    }
    public static String getDay(Day day){
        String name = switch(day){

            case SUNDAY, THURSDAY -> "WORK FROM HOME";
            case MONDAY, TUESDAY, WEDNESDAY -> "WORK FROM OFFICE";
            case FRIDAY, SATURDAY -> "WEEKEND";
            default -> "not a valid day";
        };
        System.out.println(name);
        return name;
    }
}
