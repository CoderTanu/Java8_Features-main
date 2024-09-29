package CoderTanu_Java8_PredicateDemo;

import java.util.function.Predicate;

public class PredicateJoinningDemo {
	
	
	public static void main(String args[]) {
		
	Predicate<String> ans= s -> s.length() <= 5;
	System.out.println("ans " + ans.test("coder tanu"));
	
	
	Predicate<String> checkEvenLegth= s -> s.length()%2 ==0;
	System.out.println("ans " + checkEvenLegth.test("coder tanu"));
	
	//and joining
	System.out.println("after merging with and " + ans.and(checkEvenLegth).test("coder tanu"));
	
	//or joining
	System.out.println("after merging with or " + ans.or(checkEvenLegth).test("Coder Tanu"));
		
   //negate joining
	System.out.println("after merging with and " + ans.negate().test("Coder Tanu"));
				
	}

}
