package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample12 
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(40);


		Set<Integer> uniqueElements = list.stream().collect(Collectors.toSet());
		
		uniqueElements.forEach(System.out::println);
	}
}
