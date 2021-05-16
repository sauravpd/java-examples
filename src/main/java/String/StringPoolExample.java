package String;

/**
 * StringPoolExample
 * @author saurav
 *
 */
public class StringPoolExample 
{
	public static void main(String[] args) 
	{
		// Below same strings refers to one object in string pool
		String str1 = "Hello";
		String str2 = "Hello";
		
		
		String str3 = new String("Hello");

		System.out.println(str1 == str2);   // true
		System.out.println(str1 == str3);   // false

	}
}
