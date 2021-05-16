package String;

/**
 * String Demo
 * @author saurav
 *
 */
public class StringDemo1 
{
	public static void main(String[] args) 
	{
		String str1="saurav";
		String str2="sachin";

		// charAt() method
		System.out.println(str1.charAt(4)); // a
		System.out.println(str1.charAt(0)); // s


		// compareTo() method
		System.out.println(str1.compareTo(str2)); // 18 return difference of character value

		// concat() method
		System.out.println(str1.concat(str2)); // sauravsachin

		// comtains() method
		System.out.println(str1.contains(str2)); // false

		// staetWith() method
		System.out.println(str1.startsWith("s")); // true

		// endsWith() method
		System.out.println(str1.endsWith("v")); // true

		// equals() method
		System.out.println(str1.equals(str2)); // false

		String str3="SAURAV";

		System.out.println(str1.equals(str3)); // false
		// equalsIgnoreCase() method
		System.out.println(str1.equalsIgnoreCase(str3)); // true

		// format() method
		System.out.println(String.format("Name is %s",str1));
		System.out.println(String.format("%d", 10)); //10
		System.out.println(String.format("%10d", 10)); //         10
		System.out.println(String.format("%-10d%d", 10,20)); // 10        20
	
		// indexOf() method
		
		System.out.println(str1.indexOf("s")); // 0
		System.out.println(str1.indexOf('v')); // 5
		
		
		//isEmpty() method
		System.out.println(str1.isEmpty()); //false
		
		String str4="";
		System.out.println(str4.isEmpty()); // true
	}
}
