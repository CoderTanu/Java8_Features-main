package CoderTanu_Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxDemo {

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
				Integer comStream =conStream.min((i1, i2) -> i1.compareTo(i2)).get();
				System.out.println(comStream);
				
				System.out.println("in single line");
				Integer min =asList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
				 System.out.println(min);

				 Integer max =asList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
				 System.out.println(max);

	}

}
