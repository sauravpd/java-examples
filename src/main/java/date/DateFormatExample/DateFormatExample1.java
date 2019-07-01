package date.DateFormatExample;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample1 
{
	public static void main(String[] args) 
	{
		Date date=new Date();
		System.out.println(DateFormat.getInstance().format(date));
		System.out.println(DateFormat.getDateInstance().format(date));
		System.out.println(DateFormat.getTimeInstance().format(date));
		System.out.println(DateFormat.getDateTimeInstance().format(date));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(date));
		
	}
}
