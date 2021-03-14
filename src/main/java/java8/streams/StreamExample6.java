package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample6 {
	public static void main(String[] args) 
	{
		
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println(list.stream().filter(i->i%2==0).count()); // 5
	}
}
