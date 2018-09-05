package date;

import java.time.LocalDate;

public class LocalDateExample2 
{
	public static void main(String[] args) 
	{
		LocalDate date=LocalDate.now();
		// leap year check
		System.out.println(date.isLeapYear());
	}
}
