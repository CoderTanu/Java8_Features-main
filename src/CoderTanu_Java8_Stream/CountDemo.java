package CoderTanu_Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountDemo {

	public static void main(String[] args) {
    
		List<Integer> asList = new ArrayList<Integer>();
		
		asList.add(2);
		asList.add(22);
		asList.add(21);
		asList.add(43);
		asList.add(3);
		asList.add(5);
		
		//get stream object
		Stream<Integer> openStream = asList.stream();
		
		//configure stream by filtering out  required values
		
		Stream<Integer> filterStream = openStream.filter(i-> i >=20);
		long streamCount =filterStream.count();
		System.out.println(streamCount);
		
		System.out.println("in single line");
		
		long streamCountSingle =asList.stream().filter(i -> i >=20).count();
		System.out.println(streamCountSingle);

	}

}
