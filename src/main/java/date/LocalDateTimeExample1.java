package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample1
{
	public static void main(String[] args) 
	{
		LocalDateTime dateTime=LocalDateTime.now();
		// default format as yyyy-MM-dd-HH-mm-ss.zzz
		System.out.println(dateTime);

		// format the date as dd-MM-yyyy HH:mm:ss
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		String formatDateTime = dateTime.format(format);  
		System.out.println("After Formatting: " + formatDateTime);  
	}
}
