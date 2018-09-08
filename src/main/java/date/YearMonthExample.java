package date;

import java.time.YearMonth;

public class YearMonthExample
{
	public static void main(String[] args) 
	{
		YearMonth yearMonth=YearMonth.now();
		System.out.println(yearMonth);
		System.out.println(yearMonth.getMonthValue());
		System.out.println(yearMonth.getYear());
		System.out.println(yearMonth.isLeapYear());
	}
}
