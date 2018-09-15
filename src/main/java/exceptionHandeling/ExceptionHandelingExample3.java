package exceptionHandeling;

/**
 * Exception Handeling Example
 * @author saurav
 *
 */
public class ExceptionHandelingExample3 
{
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		try
		{
			String str=null;
			if(str.isEmpty())
			{
				System.out.println("String is empty");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException found "+e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException found "+e.getMessage());
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("IndexOutOfBoundsException found "+e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException found "+e.getMessage());
		}
		finally 
		{
			System.out.println("finally block executed");
		}
	}
}
