package java8.lambdaExpression;

import java.util.function.Predicate;

/**
 * 
 * @author saurav
 *
 */
public class PredicateExample1 {

	public static void main(String[] args) 
	{
		// single line 
		
		Predicate<String> predicate = str -> str.length() >= 5;

		System.out.println(predicate.test("test"));// false
		System.out.println(predicate.test("teststr"));// true
	}
}
