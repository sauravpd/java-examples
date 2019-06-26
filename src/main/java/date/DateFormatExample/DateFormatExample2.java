package date.DateFormatExample;

import java.text.DateFormat;
import java.text.ParseException;

public class DateFormatExample2
{
	public static void main(String[] args) throws ParseException 
	{
		System.out.println(DateFormat.getInstance().parse("12/12/18 3:20 PM"));
		System.out.println(DateFormat.getDateInstance().parse("Aug 25, 2018"));
		System.out.println(DateFormat.getTimeInstance().parse("2:30:40 PM"));
		System.out.println(DateFormat.getDateTimeInstance().parse("Aug 25, 2018 2:30:40 PM"));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).parse("Aug 25, 2018 2:30:40 PM IST"));
	}
}
