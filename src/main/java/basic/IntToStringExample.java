package basic;

import java.util.Scanner;

public class IntToStringExample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);

		if(n==Integer.parseInt(s))
		{
			System.out.println("Good Job");
		}
		else
		{
			System.out.println("Wrong Answer");
		}
		sc.close();
	}
}
