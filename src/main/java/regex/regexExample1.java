package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * regex Example1
 * @author saurav
 *
 */
public class regexExample1 
{
	public static void main(String[] args) 
	{
		Pattern pattern=Pattern.compile(".b");
		Matcher matcher1=pattern.matcher("ab");
		System.out.println(matcher1.matches()); // true

		Matcher matcher2=pattern.matcher("cd");
		System.out.println(matcher2.matches()); // false

		// Any character except a, b, or c
		System.out.println(Pattern.matches("[^abc]", "x")); // true

		// character contain a, b, or c
		System.out.println(Pattern.matches("[abc]", "c")); // true

		System.out.println(Pattern.matches("[a-zA-Z]", "A"));// true
		System.out.println(Pattern.matches("[a-zA-Z]{2}", "aA"));// true

		//a-ce-f
		System.out.println(Pattern.matches("[a-c[e-f]]","d")); //false
		System.out.println(Pattern.matches("[a-c[e-f]]","e")); //true
		
		
		System.out.println(Pattern.matches("[abc]?", "a")); //true
		System.out.println(Pattern.matches("[abc]+", "cccccaaaaaaaaaaaaaaa")); //true
		System.out.println(Pattern.matches("[abc]*", "")); //true
		
		System.out.println(Pattern.matches("[a]{2}", "a")); //false
		System.out.println(Pattern.matches("[a]{2}", "aa")); //true
		
		System.out.println(Pattern.matches("[ab]{2}", "a")); //false
		System.out.println(Pattern.matches("[ab]{2}", "bb")); //true
		
		System.out.println(Pattern.matches("[ab]{2,}", "a")); //false
		System.out.println(Pattern.matches("[ab]{2,}", "bbaaaa")); //true
		
		System.out.println(Pattern.matches("[ab]{2,5}", "a")); //false
		System.out.println(Pattern.matches("[ab]{2,5}", "aabbb")); //true

		System.out.println(Pattern.matches("\\d", "1")); //true
		System.out.println(Pattern.matches("\\D", "a")); //true
		
		System.out.println(Pattern.matches("\\w{4}", "2aB5"));//true
		System.out.println(Pattern.matches("\\w{4}", "a2aB5"));//false
			
		
	}
}
