package basic;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatterExample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter payment :");
		double payment=sc.nextDouble();
		NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		NumberFormat japan=NumberFormat.getCurrencyInstance(Locale.JAPAN);
		NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("US :"+us.format(payment));
		System.out.println("India :"+india.format(payment));
		System.out.println("Japan :"+japan.format(payment));
		System.out.println("France :"+france.format(payment));
		sc.close();
	}
}
