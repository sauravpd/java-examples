package array;

import java.util.Arrays;

/**
 * move Zeroes to left
 * @author saurav
 *
 */
public class ArrayProgram6 {
	public static void main(String[] args) {
		int[] inputArray1 = new int[] {0,9,0,6,20 };
		System.out.println(Arrays.toString(moveZeroes(inputArray1))); // [9, 6, 20, 0, 0]
	}

	public static int[] moveZeroes(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
		return nums;
	}
}
