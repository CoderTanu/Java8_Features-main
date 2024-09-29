package CoderTanu_Java8_Stream;

import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		
	 Stream.of(1,2,11,111,1111,11111).forEach(x -> System.out.println(x));
	 
	 String[] name = {"code", "decode", "demos"};
	 Stream.of(name).filter(x-> x.length()>4).forEach(x -> System.out.println(x));

}
	
}
