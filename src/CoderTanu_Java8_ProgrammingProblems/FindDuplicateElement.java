package CoderTanu_Java8_ProgrammingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement {

	public static void main(String[] args) {
		
		 List<Integer> newList  = Arrays.asList(10,28,87,10,20,76,28,80);
		 Set<Integer> set= new HashSet<>();
		 newList.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x)); 
		 
	}
	

}
