package exceptionHandeling;

/**
 * Exception Handeling Example
 * @author saurav
 *
 */
public class ExceptionHandelingExample4 
{
	public static void main(String[] args) 
	{
		try
		{
			int grade=34;
			if(grade>=80)
			{
				System.out.print("A");
			}
			else if(grade>=60 && grade<80)
			{
				System.out.print("B");
			} 
			else if(grade>=40 && grade<60)
			{
				System.out.print("C");
			}
			else
			{
				System.out.println("D");
				throw new ArithmeticException("Fail");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
