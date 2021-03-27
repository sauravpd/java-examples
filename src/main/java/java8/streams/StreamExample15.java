package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample15 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println(list.stream().mapToInt(n->n).sum()); // sum of all number
	}
}
