package CoderTanu_Java8_ProgrammingProblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RefactorIntoJava8 {

	public static void main(String[] args) {
		
		
		//find the no is number prime or not
//		System.out.println(isPrime(2));
//		
//		
		
		List<Double> sqrtOfprime=Stream.iterate(1, i-> i+1)
				.filter(RefactorIntoJava8 :: isPrime).peek(x->System.out.println(x))
				.map(Math::sqrt)
				.limit(10)
				.collect(Collectors.toList());
//				new ArrayList<Double>(10);
//		int index=1;
//		while(sqrtOfprime.size() < 10) {
//			if(isPrime(index)) {
//				sqrtOfprime.add(Math.sqrt(index));
//				
//			}
//			index++;
//		}
		System.out.println(sqrtOfprime);
	
	}
	
	public static boolean isPrime(int n) {
	boolean isDivisble=false;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				isDivisble=true;
				break;
			}
		}
		
//		return n>1 && !isDivisble;
		return n>1 && IntStream.range(2,n).noneMatch(num->n%num==0);
	}
//	
	//

}
