package date.examples;

import java.sql.Date;

public class DateExample3 
{
	public static void main(String[] args)
	{
		//java.sql.date
		
		Date date=new Date(System.currentTimeMillis());
		System.out.println(date);
	}
}
