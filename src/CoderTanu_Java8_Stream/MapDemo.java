package CoderTanu_Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> arList =  new ArrayList<Integer>();
		arList.add(1);
		arList.add(20);
		arList.add(12);
		arList.add(21);
		arList.add(10);
		
//		Stream<Object> s = arList.stream().map(i-> i*i);
//		s.forEach(x ->System.out.println(x));
		
		arList.stream().map(i-> i*i).forEach(x ->System.out.println(x));
		

	}

}
