package array;

import java.util.HashSet;
import java.util.Set;

/**
 * missing number
 * 
 * @author saurav
 *
 */
public class ArrayProgram3 {
	public static void main(String[] args) {
		int[] inputArray1 = new int[] { 0, 1, 5, 3, 2 };
		System.out.println(missingNumber(inputArray1)); // 4
	}

	public static int missingNumber(int[] nums) {
		Set<Integer> numSet = new HashSet<Integer>();
		for (int num : nums)
			numSet.add(num);

		int expectedNumCount = nums.length + 1;
		for (int number = 0; number < expectedNumCount; number++) {
			if (!numSet.contains(number)) {
				return number;
			}
		}
		return -1;
	}
}
