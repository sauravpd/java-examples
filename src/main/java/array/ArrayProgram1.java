package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * two sum : return indices of the two numbers such that they add up to target
 * num
 * 
 * @author saurav
 *
 */
public class ArrayProgram1 {
	public static void main(String[] args) {
		int[] inputArray = new int[] { 2, 7, 6, 15 };
		int target = 8;
		System.out.println(Arrays.toString(twoSum(target, inputArray)));
	}

	private static int[] twoSum(int target, int[] inputArray) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inputArray.length; i++) {
			int diff = target - inputArray[i];
			if (map.containsKey(diff)) {
				result[0] = map.get(diff);
				result[1] = i;
			}
			map.put(inputArray[i], i);

		}
		return result;
	}
}
