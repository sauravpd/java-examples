package java8.lambdaExpression;

import java.util.function.BiFunction;

public class BiFunctionExample1
{
	public static void main(String[] args) 
	{
		BiFunction<String,String,String> concatFunction=(str1,str2)-> str1.concat(str2);		
		System.out.println(concatFunction.apply("","")); // india

	}
}
