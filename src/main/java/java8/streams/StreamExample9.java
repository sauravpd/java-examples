package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample9 
{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Delhi");
		list.add("Banglore");
 
		System.out.println(list.stream().anyMatch(e->e.startsWith("B"))); // true
		
		System.out.println(list.stream().anyMatch(e->e.startsWith("N"))); // false
	}
}
