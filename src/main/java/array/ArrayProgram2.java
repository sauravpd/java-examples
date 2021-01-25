package array;

import java.util.HashSet;

/**
 * 
 * find array contains any duplicates.
 * 
 * @author saurav
 *
 */
public class ArrayProgram2 {
	public static void main(String[] args) {
		int[] inputArray1 = new int[] { 4, 3, 3, 4 };
		System.out.println(containsDuplicate(inputArray1)); // true

		int[] inputArray2 = new int[] { 1, 2, 3, 4 };
		System.out.println(containsDuplicate(inputArray2)); // false
	}

	private static boolean containsDuplicate(int[] inputArray) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : inputArray) {
			if (set.contains(num)) {
				return true;
			} else {
				set.add(num);
			}
		}
		return false;
	}
}
