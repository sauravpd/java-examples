package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTime Formatter Example
 * @author saurav
 *
 */
public class DateTimeFormatterExample1 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(format.format(LocalDateTime.now()));
	}
}
