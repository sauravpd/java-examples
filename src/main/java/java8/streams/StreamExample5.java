package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);

		list.stream().distinct().forEach(System.out::println); // 10 20 30 40

	}
}
