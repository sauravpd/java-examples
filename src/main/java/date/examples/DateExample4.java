package date.examples;

import java.util.Calendar;

public class DateExample4 
{
	public static void main(String[] args) 
	{
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTimeZone());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
	}
}
