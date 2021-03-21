package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample11 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		List<Integer> evenNumbers = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		
		evenNumbers.forEach(System.out::println);
	}
}
