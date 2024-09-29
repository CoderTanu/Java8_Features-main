package CoderTanu_Java8_ConsumerDemo;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer ,Integer> checkSum = (a,b) -> a+b>=5;
		System.out.println("SUM OF 2 AND 5 IS GREATER THAN 5"+checkSum.test(2,5));
		
		BiFunction<Integer, Integer,Integer> multiplBoth=(a,b) -> a*b;
		System.out.println("multiple"+multiplBoth.apply(2,5));
		
	}

}
