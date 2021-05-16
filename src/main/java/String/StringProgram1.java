package String;

import java.util.Scanner;

/**
 * 
 * Reverse String
 * 
 * @author saurav
 *
 */
public class StringProgram1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("String : "+input);
		System.out.println("reverse string : "+reverseString(input.toCharArray()));
		sc.close();
	}

	private static String reverseString(char[] input) {
		int i=0;
		int j=input.length-1;
		while(i<j) {
			char temp=input[i];
			input[i]=input[j];
			input[j]=temp;
			i++;
			j--;
		}
		return new String(input);
	}
}
