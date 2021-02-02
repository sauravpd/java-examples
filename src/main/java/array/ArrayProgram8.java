package array;

/**
 * valid Mountain Array
 * @author saurav
 *
 */
public class ArrayProgram8 
{
	public static void main(String[] args) {
		int[] inputArray1 = new int[] {0,1,2,3,2,1 };
		System.out.println(validMountainArray(inputArray1)); // true
	}
	public static boolean validMountainArray(int[] A) {
		int i = 0;
		while (i < A.length && i + 1 < A.length && A[i] < A[i + 1]) {
			i++;
		}
		if (i == 0 || i + 1 >= A.length) {
			return false;
		}
		while (i < A.length && i + 1 < A.length) {
			if (A[i] <= A[i++ + 1]) {
				return false;
			}
		}
		return true;
	}
}
