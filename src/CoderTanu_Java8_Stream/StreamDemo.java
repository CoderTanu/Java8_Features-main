package CoderTanu_Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> arList =  new ArrayList<Integer>();
		arList.add(1);
		arList.add(20);
		arList.add(12);
		arList.add(21);
		arList.add(10);
		arList.add(5);
		
		//with stream
		List<Integer> newA1 = new ArrayList<Integer>();
		newA1=arList.stream().filter(x-> x >=15).collect(Collectors.toList());
		newA1.stream().forEach(x -> System.out.println(x));
		
		//without streeam
//		List<Integer> asListFromMethod =findElement(arList) ;
//		System.out.println(asListFromMethod);
//		
//	}
//	
//	public static List<Integer> findElement(List<Integer> asList){
//		List<Integer> newA1 = new ArrayList<Integer>();
//		
//		for(Integer i :asList) {
//			if(i>=15) {
//				newA1.add(i);
//			}
//		}
//		return newA1;
	}

}
