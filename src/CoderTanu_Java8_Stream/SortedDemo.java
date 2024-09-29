package CoderTanu_Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedDemo {

	
		public static void main(String[] args) {
			
			List<Integer> arList =  new ArrayList<Integer>();
			arList.add(1);
			arList.add(20);
			arList.add(12);
			arList.add(21);
			arList.add(10);

			

			//get stream object
			Stream<Integer> openStream = arList.stream();
			
			//configure stream by filtering out required values
			Stream<Integer> filterStream =openStream.filter(i -> i >=20);
			
			Stream<Integer> newFilteredListOrigin = filterStream.sorted();
			newFilteredListOrigin.forEach(x -> System.out.println(x));
			
			
			//in single line
			
			
			Stream<Integer> newFilteredListOriginSingleLine = arList.stream().filter(i -> i >=20).sorted();
			newFilteredListOriginSingleLine.forEach(x ->System.out.println(x));
			
	}

}
