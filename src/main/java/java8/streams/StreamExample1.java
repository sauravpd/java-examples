package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		list.stream().filter(n -> n % 2 == 0).limit(3).map(x -> x * x).forEach(System.out::println);
	}
}
