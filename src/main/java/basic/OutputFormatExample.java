package basic;

import java.util.Scanner;

public class OutputFormatExample 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Age :");
		int age=sc.nextInt();
		System.out.println("*******************");
		System.out.println("Student details");
		System.out.println("*******************");
		System.out.printf("%-10s%05d%n",name,age);
		System.out.println("*******************");
		sc.close();
	}
}
