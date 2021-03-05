package java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		
		System.out.println("**** descending order ****");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // descending order
		
		
		System.out.println("**** ascending order ****");
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println); // ascending order
	}
}
