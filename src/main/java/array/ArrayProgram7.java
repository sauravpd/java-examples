package array;

import java.util.HashMap;
import java.util.Map;

/**
 * majority Element
 * @author saurav
 *
 */
public class ArrayProgram7 
{
	public static void main(String[] args) {
		int[] inputArray1 = new int[] {4,5,4,7,8,4 };
		System.out.println(majorityElement(inputArray1)); // 4
	}
	
	public static int majorityElement(int[] nums) {
		if(nums.length==1){
			return nums[0];
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:nums){
			if(!map.containsKey(i)){
				map.put(i,1);
			}
			else{

				map.put(i,map.get(i)+1);
			}
		}

		Map.Entry<Integer, Integer> majorityEntry = null;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(majorityEntry==null || entry.getValue()>majorityEntry.getValue()){
				majorityEntry=entry;
			}
		}
		return majorityEntry.getKey();
	}
}
