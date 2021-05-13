package java8.lambdaExpression;

import java.util.function.Predicate;

public class PredicateExample3 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> isEven = (num) -> num % 2==0;

		System.out.println(isEven.test(4)); // true

	}
}
