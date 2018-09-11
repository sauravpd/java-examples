package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExample2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the String");
			String inputString=sc.nextLine();
			System.out.println("Enter the regex pattern");
			String strpattern=sc.nextLine();

			Pattern pattern=Pattern.compile(strpattern);
			Matcher matcher=pattern.matcher(inputString);
			boolean isFound=false;
			while(matcher.find())
			{
				System.out.println("found "+matcher.group()+" at start index "+matcher.start()+" and end index "+matcher.end());
				isFound=true;
			}
			if(!isFound)
			{
				System.out.println("No match found");
			}
		}
		finally 
		{
			sc.close();
		}
	} 
}
