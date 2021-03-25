package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample14 
{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Delhi");
		list.add("Banglore");
		
		Stream<String> s1 = list.stream().filter(s->s.startsWith("B"));
		
		s1.forEach(System.out::println);
		System.out.println("********");
		s1.forEach(System.out::println);
	}
}
