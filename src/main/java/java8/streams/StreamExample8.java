package java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample8 
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
 
		System.out.println(list.stream().min(Comparator.naturalOrder()).get()); // 1
		
		System.out.println(list.stream().max(Comparator.naturalOrder()).get());  // 10 

	}
}
