package CoderTanu_Java8_PredicateDemo;

import java.util.function.Predicate;

public class PredicateDemo {
	
	
	public static void main(String args[]) {
		
	Predicate<String> ans= s -> s.length() <= 5;
	System.out.println("ans " + ans.test("coder tanu"));
	}

}
