package dataTypeConversion;

public class StringToCharConversionExample 
{
	public static void main(String[] args) 
	{
		String str="Java";
		System.out.println(str.charAt(1));
		
		for (int i = 0; i < str.length(); i++) 
		{
			System.out.println(str.charAt(i));
		}
		
		for(char c:str.toCharArray())
		{
			System.out.println(c);
		}
	}
}
