package java8.lambdaExpression;

import java.util.function.Consumer;

public class ConsumerExample1 
{
	public static void main(String[] args) 
	{
		Consumer<String> consumer1=(str)->{
			System.out.println("consumer 1 "+str);
		};
		
		Consumer<String> consumer2=(str)->{
			System.out.println("consumer 2 "+str);
		};
		
		consumer1.andThen(consumer2);
		
		
	}
}
