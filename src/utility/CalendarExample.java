package utility;

import java.util.Calendar;

public class CalendarExample {
public static void main(String[] args) {
	String months[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEPT", "OCT", "NOV", "DEC"};
    
    /*Create a calendar initialized with the
    current date and time in the default
    locale and timezone.*/
    Calendar cal = Calendar.getInstance();
    System.out.println("Cal is :"+cal);
    
    //Display current time and date information.
    System.out.println("Date :");
    System.out.println(cal.get(java.util.Calendar.MONTH));
    
    System.out.print(months[cal.get(java.util.Calendar.MONTH)]);
    System.out.print(" " + cal.get(Calendar.DATE) + " ");// LINE D
    System.out.println(cal.get(Calendar.YEAR));
//    
    System.out.println("Current Time: "); // LINE A
    System.out.print(cal.get(Calendar.HOUR) + ":");
    System.out.print(cal.get(Calendar.MINUTE) + ":");
    System.out.println(cal.get(Calendar.SECOND));
//    
//    //Set the time and date information and display it.
    cal.set(Calendar.HOUR, 10); // LINE C
    cal.set(Calendar.MINUTE, 29); // LINE C
    cal.set(Calendar.SECOND, 22); // LINE C
//    
    System.out.println("Updated time"); // LINE B
    System.out.print(cal.get(Calendar.HOUR) + ":");
    System.out.print(cal.get(Calendar.MINUTE) + ":");
    System.out.println(cal.get(Calendar.SECOND));

}
}
