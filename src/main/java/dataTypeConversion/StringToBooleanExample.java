package dataTypeConversion;

public class StringToBooleanExample 
{
	public static void main(String[] args) 
	{
		String str="true";
		System.out.println(Boolean.parseBoolean(str));
		if(Boolean.parseBoolean(str))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
