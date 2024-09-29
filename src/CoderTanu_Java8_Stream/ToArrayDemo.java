package CoderTanu_Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		

		List<Integer> asList = new ArrayList<Integer>();
		asList.add(1);
		asList.add(104);
		asList.add(23);
		asList.add(11);
		asList.add(2);
		asList.add(56);
		
		//get stream object
		Stream<Integer> openStream = asList.stream();
		
		//configure stream by filtering out required values
		Stream<Integer> filterStream =openStream.filter(i -> i >=20);
		
		Object[] intArr = filterStream.toArray();
		for(Object o:intArr ) {
			System.out.println("element in array is" + o);
		}
		
		System.out.println("in sinle line"	);
		
		//in single line
		
		
	    Object[] intArr2 = asList.stream().filter(i -> i >=20).toArray();
	    for(Object o:intArr2 ) {
			System.out.println("element in array is" + o);
		}
		

	}

}
