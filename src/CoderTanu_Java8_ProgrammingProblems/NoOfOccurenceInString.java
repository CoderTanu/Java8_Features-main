package CoderTanu_Java8_ProgrammingProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoOfOccurenceInString {

	public static void main(String[] args) {
		
		
		String s="welcome to code decode and code decode welcome you";
	
		List<String> newList = Arrays.asList(s.split(" "));
		Map<String , Long> map =newList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	   System.out.print(map);
	}
	
	

}
