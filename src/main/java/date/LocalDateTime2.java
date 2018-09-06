package date;


import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
/**
 * LocalDateTime example 
 * @author saurav
 *
 */
public class LocalDateTime2 
{
	public static void main(String[] args) 
	{
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println(dateTime.get(ChronoField.DAY_OF_WEEK));
		System.out.println(dateTime.get(ChronoField.DAY_OF_YEAR));
		System.out.println(dateTime.get(ChronoField.HOUR_OF_DAY));
		System.out.println(dateTime.get(ChronoField.MINUTE_OF_DAY));
	}
}
