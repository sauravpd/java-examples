package date;

import java.time.LocalTime;

/**
 * LocalTime Example 
 * @author saurav
 *
 */
public class LocalTimeExample1 
{
	public static void main(String[] args) 
	{
		LocalTime time=LocalTime.now();
		// default format of hour-minute-second.
		System.out.println(time);

		System.out.println(time.minusHours(1));
		System.out.println(time.plusHours(1));
	}
}
