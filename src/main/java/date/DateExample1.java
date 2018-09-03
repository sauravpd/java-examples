package date;

import java.util.Date;

/**
 * Date Example
 * @author saurav
 *
 */
public class DateExample1 
{
	public static void main(String[] args) 
	{
		Date date=new Date();
		System.out.println(date);
		
		System.out.println(new Date(System.currentTimeMillis()));
	}
}
