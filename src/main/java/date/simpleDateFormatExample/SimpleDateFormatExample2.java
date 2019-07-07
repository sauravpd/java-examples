package date.simpleDateFormatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExample2 
{
	public static void main(String[] args) throws ParseException 
	{
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").parse("2018/12/08"));
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2018"));
		System.out.println(new SimpleDateFormat("dd MMM yyyy").parse("05 Jun 2019"));
		System.out.println(new SimpleDateFormat("dd MMMM yyyy").parse("10 June 2019"));
		System.out.println(new SimpleDateFormat("E, dd MMM yyyy hh:mm:ss z").parse("Sun, 05 Jun 2018 02:16:36 IST"));
	}
}
