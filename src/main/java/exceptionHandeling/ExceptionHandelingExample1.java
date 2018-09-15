package exceptionHandeling;

public class ExceptionHandelingExample1 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception found: "+e.getMessage());
		}
		System.out.println("**** End of program ****");
	}
}
