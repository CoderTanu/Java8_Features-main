package CoderTanu_StructuredToFunctionalProgramming;

import java.util.List;

public class FP01FunctionalProgramming {

	public static void main(String[] args) {
	
//		printAllNumbersInListFunctional(List.of(12,9,2,13,4,6,2,4,12,15));
//		printAllEvenNumbersInListFunctional(List.of(12,9,2,13,4,6,2,4,12,15));
		printAllOddNumbersInListFunctional(List.of(12,9,2,13,4,6,2,4,12,15));
		printAllCoursesInListFunctional(List.of("Spring", "Spring boot", "API", "Micrservices", "AWS","PCF","AZURE", "Docker", "Kubernetes"));

	}

	private static void printAllCoursesInListFunctional(List<String> courses) {
		
		courses.stream().forEach(System.out::println);
		
		courses.stream().filter(x-> x.contains("Spring")).forEach(System.out::println);
		
		courses.stream().filter(x-> x.length()>=4).forEach(System.out::println);
		
		courses.stream().map(x-> x + " " + x.length()).forEach(System.out::println);
	}

	private static void printAllOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(x->  x%2 !=0).forEach(System.out:: println);
		
		numbers.stream().filter(x->  x%2 !=0)
		.map(x-> x*x*x)
		.forEach(System.out:: println);
		
	}

	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream().filter(x->  x%2 ==0).forEach(System.out:: println);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		//what to do
//		numbers.stream().forEach(FP01FunctionalProgramming:: print);
		numbers.stream().forEach(System.out:: println);
	}

//	private static void print(int n) {
//		System.out.println(n);
//	}

}
