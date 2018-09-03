package date;

import java.util.Calendar;

/**
 * Calendar example
 * @author saurav
 *
 */
public class CalendarExample1 
{
	public static void main(String[] args) 
	{
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTimeZone());
		System.out.println(calendar.getCalendarType());
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
	}
}
