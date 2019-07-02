package dataTypeConversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConversionExample1 
{
	public static void main(String[] args) throws ParseException 
	{
		String dateStr="25/12/2018";
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		Date date=formatter.parse(dateStr);
		System.out.println(date);
	}
}
