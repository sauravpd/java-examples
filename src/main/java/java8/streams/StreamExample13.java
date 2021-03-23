package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample13 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Delhi");
		list.add("Banglore");
		
		System.out.println(list.stream().collect(Collectors.joining(","))); // Mumbai,Pune,Delhi,Banglore
	}
	
	
}
