package date;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * MonthDay Example
 * @author saurav
 *
 */
public class MonthDayExample1 
{
	public static void main(String[] args) 
	{
		MonthDay month = MonthDay.now();  
		LocalDate date = month.atYear(2018);  
		System.out.println(month.getDayOfMonth());
		System.out.println(month.getMonth());
		System.out.println(month.getMonthValue());
		System.out.println(date); 
	}
}
