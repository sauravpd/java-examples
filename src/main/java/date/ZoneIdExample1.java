package date;

import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdExample1 
{
	public static void main(String[] args) 
	{
		ZoneId zone=ZoneId.systemDefault();

		System.out.println(zone);
		System.out.println(zone.getId());
		System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));
	}
}
