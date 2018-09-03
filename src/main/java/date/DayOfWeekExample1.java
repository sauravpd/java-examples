package date;

import java.time.DayOfWeek;

public class DayOfWeekExample1 
{
	public static void main(String[] args) 
	{
		for(DayOfWeek dayOftheWeek:DayOfWeek.values())
		{
			System.out.println(dayOftheWeek+" "+dayOftheWeek.getValue()+" "+dayOftheWeek.name()+" "+dayOftheWeek.ordinal());
		}
		System.out.println(DayOfWeek.FRIDAY.name().toLowerCase());
	}
}
