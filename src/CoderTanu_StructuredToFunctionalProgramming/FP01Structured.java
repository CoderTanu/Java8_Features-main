package CoderTanu_StructuredToFunctionalProgramming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
	
		printAllNumbersInListStructured(List.of(12,9,2,13,4,6,2,4,12,15));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		
		//How to loop the number or do
		for(int num : numbers) {
			System.out.println(num);
		}
		
	}

}
