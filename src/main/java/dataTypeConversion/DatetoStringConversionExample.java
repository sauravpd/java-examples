package dataTypeConversion;

import java.text.DateFormat;
import java.util.Date;

public class DatetoStringConversionExample 
{
	public static void main(String[] args) 
	{
		Date date=new Date();
		DateFormat formatter=DateFormat.getDateInstance();
		String strDate=formatter.format(date);
		System.out.println(strDate);
	}
}
