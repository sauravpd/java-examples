package date.examples;

import java.util.TimeZone;

public class DateExample5 
{
	public static void main(String[] args) 
	{
		String[] timzones = TimeZone.getAvailableIDs();
		for(String timezone:timzones)
		{
			System.out.println(timezone);
		}
	}
}
