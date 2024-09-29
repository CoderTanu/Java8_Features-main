package CoderTanu_Java8_PredicateDemo;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public static void main(String[] args) {
		
//		
//		PredicateFunctionDemo predicateFunctionDemo = new PredicateFunctionDemo();
//		System.out.println(predicateFunctionDemo.testStringLength("Coder tanu"));
		
		//predicate is functional interface used to check boolean condition and also  reduce the code of line 
		
		Predicate<String> checkLength = s -> s.length()>=5;
		System.out.println("The length of string is greater than 5: " +checkLength.test("coder tanu") );

	}
//	
//	public boolean testStringLength(String s) {
//		if(s.length() >=5) {
//			return true;
//		}else {
//			return false;
//		}
//	}

}
