package String;

import java.util.HashMap;
import java.util.Scanner;

/**
 *  First Unique Character in a String
 * @author saurav
 *
 */
public class StringProgram2 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(firstUniqChar(input));
		sc.close();
	}

	public static int firstUniqChar(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(!map.containsKey(c)){
				map.put(c,i);
			}
			else{
				map.put(c,-1);
			}
		}

		int min=Integer.MAX_VALUE;
		for(char c:map.keySet()){
			if(map.get(c)>-1 && map.get(c)<min)
			{
				min=map.get(c);
			}
		}
		return min==Integer.MAX_VALUE?-1:min;
	}
}


