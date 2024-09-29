package CoderTanu_Java8_ConsumerDemo;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
	
//		ConsumerDemo consumerDemo= new ConsumerDemo();
//		consumerDemo.test(7);
		
		//to decrease the lines of code and reuse in other functionality  using consumer interface
		Consumer<Integer> squarMe =i -> System.out.println("sqaure of a number without java8 function "+i*i);
		squarMe.accept(5);
	}
	
//	public void  test(int i) {
//		int s =i*i;
//		System.out.println("sqaure of a number without java8 function "+s);
//	}

}
