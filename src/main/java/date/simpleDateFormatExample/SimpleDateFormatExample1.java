package date.simpleDateFormatExample;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExample1 
{
	public static void main(String[] args) 
	{
		Date d=new Date(System.currentTimeMillis());
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(d));
		System.out.println(new SimpleDateFormat("yyyy/M/dd").format(d));
		System.out.println(new SimpleDateFormat("dd MM yyyy").format(d));
		System.out.println(new SimpleDateFormat("dd MMM yyyy").format(d));
		System.out.println(new SimpleDateFormat("dd MMMM yyyy").format(d));
		System.out.println(new SimpleDateFormat("dd MMM yyyy HH:mm:ss").format(d));
		System.out.println(new SimpleDateFormat("E, dd MMM yyyy hh:mm:ss").format(d));
		System.out.println(new SimpleDateFormat("E, dd MMM yyyy hh:mm:ss z").format(d));
		System.out.println(new SimpleDateFormat("E, dd MMM yyyy hh:mm:ss zzzz").format(d));
	}
}
