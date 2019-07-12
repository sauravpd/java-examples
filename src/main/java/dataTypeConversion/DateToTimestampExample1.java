package dataTypeConversion;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimestampExample1 
{
	public static void main(String[] args) 
	{
		Date date = new Date();  
		Timestamp ts=new Timestamp(date.getTime());
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatter.format(ts));
	}
}
