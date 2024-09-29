package CoderTanu_Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDecesndingOrder {

	public static void main(String[] args) {
		
		
		List<Integer> asList = new ArrayList<Integer>();
		asList.add(1);
		asList.add(104);
		asList.add(23);
		asList.add(11);
		asList.add(2);
		asList.add(56);
		
		//get stream object
		
		Stream<Integer> newStream =asList.stream();
		
		//configure the stream object by filtering out the required value
		
		Stream<Integer> conStream = newStream.filter(i -> i>=20);
		
		//u can sort on any stream filter or mapped or normal stream
		Stream<Integer> comStream =conStream.sorted((i1, i2) -> i2.compareTo(i1));
		comStream.forEach(x -> System.out.println(x));
		
		System.out.println("in single line");
		Stream<Integer> comSingleStream =asList.stream().filter(i-> i >=20).sorted((i1, i2) -> i2.compareTo(i1));
		comSingleStream.forEach(x -> System.out.println(x));
	}

}
