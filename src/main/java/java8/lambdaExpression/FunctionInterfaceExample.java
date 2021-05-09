package java8.lambdaExpression;

import java.util.function.BiFunction;

public class FunctionInterfaceExample 
{
	public static void main(String[] args) 
	{
		BiFunction<String,String,String> biFunction=String::concat;
		
		System.out.println(biFunction.apply("Java 8 ", " Fuctional Interface"));
	}
}
