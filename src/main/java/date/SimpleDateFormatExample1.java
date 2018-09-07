package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat Example
 * @author saurav
 *
 */
public class SimpleDateFormatExample1 
{
	public static void main(String[] args) throws ParseException 
	{
		Date date = new Date();  
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");  
		
		// date to string
		String dateAfterFormat= format.format(date);  
		System.out.println(dateAfterFormat);  
		
		// String to date
		Date date1=format.parse("2018/09/15");
		System.out.println(date1);
	}
}
