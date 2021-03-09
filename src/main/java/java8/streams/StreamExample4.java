package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		list.stream().filter(n -> n % 2 == 0).filter(n -> n > 5).map(n -> n * n).forEach(System.out::println); 

	}
}
