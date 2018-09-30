package basic;

import java.util.Scanner;

/**
 * byte is an 8-bit signed integer.
 * short is a 16-bit signed integer.
 * int is a 32-bit signed integer.
 * long is a 64-bit signed integer.
 * @author saurav
 *
 */
public class DatatypeExample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		try 
		{
			long num = sc.nextLong();
			System.out.println(num + " can be fitted in:");
			if (num >= -128 && num <= 127) System.out.println("* byte");
			if (num >= -32768 && num <= 32767) System.out.println("* short");
			if (num >= -2147483648 && num <= 2147483647) System.out.println("* int");
			if (num >= -9223372036854775808L && num <= 9223372036854775807L) System.out.println("* long");
		} catch (Exception e) {
			System.out.println(sc.next() + " can't be fitted anywhere.");
		}
		sc.close();
	}
}
