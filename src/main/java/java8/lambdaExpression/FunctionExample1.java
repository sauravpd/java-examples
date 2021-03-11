package java8.lambdaExpression;

import java.util.function.Function;

public class FunctionExample1 
{
	public static void main(String[] args) 
	{
		Function<String,String> toLowerCaseFunction=s->s.toLowerCase();
			
		System.out.println(toLowerCaseFunction.apply("INDIA")); // india

		System.out.println(toLowerCaseFunction.andThen(s->s.charAt(0)).apply("INDIA")); // i
	}
}
