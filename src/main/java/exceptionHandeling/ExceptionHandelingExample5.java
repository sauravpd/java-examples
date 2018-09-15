package exceptionHandeling;

/**
 * Exception Handeling Example
 * @author saurav
 *
 */
public class ExceptionHandelingExample5 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new CustomException("custom exception");
		}
		catch(CustomException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
