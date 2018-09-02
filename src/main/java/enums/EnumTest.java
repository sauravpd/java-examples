package enums;

public class EnumTest 
{
	public static void main(String[] args) 
	{
		// String to enum
		Color color=Color.valueOf("RED");
		System.out.println(color);
		
		// enum to string
		String green=Color.GREEN.name();
		System.out.println(green);
	}
}
