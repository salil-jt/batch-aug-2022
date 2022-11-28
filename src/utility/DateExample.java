package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		try {
			// Get current date and time
			Date date = new Date(); // LINE A
			System.out.println(date);
			// Convert Date to String.
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); // LINE B
			String stringDate = dateFormat.format(date); // LINE C
			System.out.println(stringDate);
			// Convert String to Date.
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String dateInString = "15/08/1947 02:25:56";
			date = df.parse(dateInString); // LINE D
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
