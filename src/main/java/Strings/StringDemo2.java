package Strings;

/**
 * String Demo
 * @author saurav
 *
 */
public class StringDemo2 
{
	public static void main(String[] args) 
	{
		String str1="saurav";
		String str2="sachin";

		// join() method
		System.out.println(str1.join("|", "saurav","sachin")); // saurav|sachin

		// IndexOf()
		System.out.println(str1.indexOf('a'));// 
		// lastIndexOf()
		System.out.println(str1.lastIndexOf('a'));// 4

		// length
		System.out.println(str1.length()); //6

		System.out.println(str1.replace("a", "@")); // s@ur@v
		System.out.println(str1.replaceAll("a","@"));// s@ur@v

		// toCharArray()
		char[] charArray=str1.toCharArray();
		for(char c:charArray)
		{
			System.out.println(c);
		}

		String str3="welcome to java";
		for(String s:str3.split("\\s"))
		{
			System.out.println(s);
		}

		for(String s:str3.split("\\s",1))
		{
			System.out.println(s);
		}

		System.out.println(str3.substring(6));// e to java

		System.out.println(str1.toUpperCase()); // SAURAV
		System.out.println(str1.toLowerCase()); // saurav
	
		
		// trim() method
		String str4="   Wecome to Java     ";
		System.out.println(str4.trim()); //Wecome to Java
	
	
		String str5="100";
		System.out.println(String.valueOf(str5)+100); // 100100
	}
}
