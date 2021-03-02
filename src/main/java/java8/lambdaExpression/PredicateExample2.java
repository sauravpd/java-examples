package java8.lambdaExpression;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) 
	{
		Predicate<Integer> predicate1 = (num) -> num >= 10;

		Predicate<Integer> predicate2 = (num) -> num <= 20;

		System.out.println(predicate1.and(predicate2).test(15)); // true

		System.out.println(predicate1.and(predicate2).test(5)); // false
		
		System.out.println(predicate1.negate().test(15)); // false

	}
}
