package CoderTanu_Java8_PredicateDemo;

import java.util.function.Function;

public class FunctionDemo {
	
	
	public static void main(String args[]) {
	
//		FunctionDemo functionDemo = new FunctionDemo();
//		System.out.println( functionDemo.printSquare(7));
//		
		
		
		//use to reduce the line of code and Function functionalIterface help to store various type of data type but in predicate functionalIterface  is only hold boolean 
		
	Function<Integer, Integer> square= i -> i*i ;
	System.out.println("The square is " + square.apply(8));
	
	}
	
//	public int printSquare(int a) {
//		return a*a;
//	}

}
