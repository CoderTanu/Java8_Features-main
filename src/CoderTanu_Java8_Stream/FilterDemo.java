package CoderTanu_Java8_Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	
public static void main(String[] args) {
		
		List<Integer> arList =  new ArrayList<Integer>();
		arList.add(1);
		arList.add(20);
		arList.add(12);
		arList.add(21);
		arList.add(10);
		
//		Stream s = arList.stream().filter(i-> i%2==0);
//		s.forEach(x ->System.out.println(x));
		
		arList.stream().filter(i-> i%2==0).forEach(x ->System.out.println(x));
		
		
}
}
