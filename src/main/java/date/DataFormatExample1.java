package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DataFormatExample1 
{
	public static void main(String[] args) throws ParseException 
	{
		Date date=new Date();
		System.out.println(date);

		// date to string
		String dateafterFormat=DateFormat.getDateInstance().format(date);
		System.out.println(dateafterFormat);

		// string to date
		Date date1=DateFormat.getDateInstance().parse("Sep 15, 2018");
		System.out.println(date1);

	}
}
