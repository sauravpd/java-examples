package basic;

import java.util.Scanner;

public class IfElseExample 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value of N :");
		int Num=scanner.nextInt();
		if(Num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		scanner.close();
	}
}
