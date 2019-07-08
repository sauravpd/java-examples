package dataTypeConversion;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDateExample 
{
	public static void main(String[] args) 
	{
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		Date date=new Date(ts.getTime());
		System.out.println(date);
	}
}
