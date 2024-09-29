package CoderTanu_Java8_ConsumerDemo;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<Integer> squarMe =i -> System.out.println("sqaure of a number without java8 function "+i*i);
		squarMe.accept(5);
		
		Consumer<Integer> doubleMe =i -> System.out.println("sqaure of a number without java8 function "+2*i);
		doubleMe.accept(5);
		
		squarMe.andThen(doubleMe).accept(5);

	}

}
