package date;

import java.util.Calendar;

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
