package CoderTanu_Java8_Lambda;

import java.util.function.BiConsumer;

public class LambdaDemo {
	
	//before java 8
	//sum of two number
	public int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
//		LambdaDemo lambda = new LambdaDemo();
//		int v=lambda.add(2, 4);
//		System.out.println(v);
		
		
		BiConsumer<Integer, Integer> biConsumer = (a,b)->System.out.print(a+b);
		biConsumer.accept(2, 5);
		
       
	}

}
