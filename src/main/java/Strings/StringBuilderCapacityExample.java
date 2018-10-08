package Strings;

public class StringBuilderCapacityExample 
{
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abc"); // 16 + 3
		StringBuilder b = new StringBuilder(50);    // 50
		StringBuilder c = new StringBuilder();      // 16
		a.append("def");

		System.out.println(a);
		System.out.println("Capacity a: " + a.capacity());  // default(16) + abc(3) = 19
		System.out.println("Length a: " + a.length());      // abcdefg = 6
		System.out.println("Capacity b: " + b.capacity());  // given size 50
		System.out.println("Length b: " + b.length());      // empty content
		System.out.println("Capacity c: " + c.capacity());  // default is 16, empty means capacity is 16
		System.out.println("Length c: " + c.length());      // empty content
	}
}
