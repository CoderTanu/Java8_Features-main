package CoderTanu_Java8_PredicateDemo;

import java.util.function.Function;

public class FunctionChaning {

	public static void main(String[] args) {
		
		
		Function<Integer, Integer> doubleInt = i -> 2*i;
		System.out.println("Double function value:" +doubleInt.apply(2));
		
		Function<Integer, Integer> cubeInt =i-> i*i*i;
		System.out.println("cubeInt function value:" +cubeInt.apply(2));
		
		
		System.out.println("Double function value:" +doubleInt.andThen(cubeInt).apply(2));
		System.out.println("cubeInt function value:" +doubleInt.compose(cubeInt).apply(2));

	}

}
