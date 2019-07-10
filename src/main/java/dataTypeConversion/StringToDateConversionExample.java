package dataTypeConversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class StringToDateConversionExample 
{
	public static void main(String[] args) throws ParseException 
	{
		String dateStr="Aug 25, 2018";
		DateFormat formatter=DateFormat.getDateInstance();
		Date date=formatter.parse(dateStr);
		System.out.println(date);
	}
}
