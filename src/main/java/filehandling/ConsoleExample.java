package filehandling;

import java.io.Console;

/**
 * Console Example
 * @author saurav
 *
 */
public class ConsoleExample 
{
	public static void main(String[] args) 
	{
		try
		{ 
			Console c=System.console();    
			System.out.println("Enter password: ");    
			char[] ch=c.readPassword();    
			String pass=String.valueOf(ch);//converting char array into string    
			System.out.println("Password is: "+pass);     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
