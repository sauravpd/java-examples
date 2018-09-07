package date;

import java.time.Year;

public class YearExample 
{
	public static void main(String[] args) 
	{
		Year year=Year.now();
		System.out.println(year);
		System.out.println(year.getValue());
		System.out.println(year.isAfter(year.minusYears(1)));
		System.out.println(year.isBefore(year.plusYears(1)));
		System.out.println(year.isLeap());
		System.out.println(year.length());
	}

}
