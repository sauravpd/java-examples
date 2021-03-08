package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		list.stream().skip(4).forEach(System.out::println); // skip first 4 element

	}
}
