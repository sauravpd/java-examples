package staticImport;

import java.util.Scanner;
import static staticImport.Calulation.add;

/**
 * CalculationTest static import example
 * @author saurav
 *
 */
public class CalculationTest 
{
	public static void main(String[] args) 
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter value of a :");
	int a=scanner.nextInt();
	System.out.println("Enter value of b :");
	int b=scanner.nextInt();
	int sum=add(a, b);
	System.out.println("Addition is "+sum);
	scanner.close();
	}
}
