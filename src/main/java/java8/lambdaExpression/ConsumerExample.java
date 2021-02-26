package java8.lambdaExpression;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// multi line
		Consumer<String> consumer = (str) -> {
			System.out.println(str.toUpperCase());
			System.out.println(str.toLowerCase());

		};

		consumer.accept("test");
		consumer.accept("teststr");
	}

}
