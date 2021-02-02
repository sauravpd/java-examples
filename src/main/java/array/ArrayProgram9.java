package array;
/**
 * minCostClimbingStairs
 * @author saurav
 *
 */
public class ArrayProgram9 
{
	public static void main(String[] args) {
		int[] inputArray1 = new int[] {10,5,40,15,20 };
		System.out.println(minCostClimbingStairs(inputArray1)); // 20
	}
	public static int minCostClimbingStairs(int[] cost) {
		int step1 = 0;
		int step2 = 0;
		for (int i = cost.length - 1; i >= 0; i--) {
			int current_step = cost[i] + Math.min(step1, step2);
			step1 = step2;
			step2 = current_step;
		}
		return Math.min(step1, step2);
	}
}
