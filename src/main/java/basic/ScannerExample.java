package basic;

import java.util.Scanner;

public class ScannerExample 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value of a :");
		int a=scanner.nextInt();
		System.out.println("Enter Value of b :");
		int b=scanner.nextInt();
		int sum=a+b;
		System.out.println("Addition is : "+sum);
		scanner.close();
	}
}
