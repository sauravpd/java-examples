package java8.lambdaExpression;

/**
*
*Math Operation test class (Add / Sub/ Mult / Div) 
*
*/
public class MathOperationtest 
{
	public static void main(String[] args)
	{
		MathOperation add = (a, b) -> a + b;
		MathOperation sub = (a, b) -> a - b;
		MathOperation mult = (a, b) -> a * b;
		MathOperation div = (a, b) -> a / b;
		
		System.out.println(caculate(add));
		System.out.println(caculate(sub));
		System.out.println(caculate(div));
		System.out.println(caculate(mult));
	}
	
	private static int caculate(MathOperation op) 
	{
		return op.operate(10,10);
	}
}
