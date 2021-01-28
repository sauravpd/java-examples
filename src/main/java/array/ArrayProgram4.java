package array;

/**
 * Fibonacci Number
 * 
 * @author saurav
 *
 */
public class ArrayProgram4 {
	public static void main(String[] args) {
		System.out.println(getFibonacciNumber(8)); // 21
	}

	public static int getFibonacciNumber(int num) {
		if (num <= 1) {
			return num;
		}
		return getFibonacciNumber(num - 1) + getFibonacciNumber(num - 2);
	}
}
