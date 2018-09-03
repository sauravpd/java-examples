package date;

import java.sql.Date;

/**
 * Date Example
 * @author saurav
 *
 */
public class DateExample2 
{
	public static void main(String[] args) 
	{
		Date date=new Date(System.currentTimeMillis());
		System.out.println(date);
	}
}
