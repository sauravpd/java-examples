package date;

import java.time.Month;

public class MonthEnumExample 
{
	public static void main(String[] args) 
	{
		for(Month month:Month.values())
		{
			System.out.println(month+" "+month.getValue()+" "+month.name()+" "+month.ordinal());
		}
		System.out.println(Month.AUGUST.name().toLowerCase());
	}
}
