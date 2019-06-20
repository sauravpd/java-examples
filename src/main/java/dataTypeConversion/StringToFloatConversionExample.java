package dataTypeConversion;

public class StringToFloatConversionExample 
{
	public static void main(String[] args) 
	{
		String floatNum="3.14";
		System.out.println(Float.parseFloat(floatNum)+1.12);
		System.out.println(floatNum+1.12);
	}
}
