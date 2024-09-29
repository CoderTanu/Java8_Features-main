package CoderTanu_Java8_ConsumerDemo;

import java.sql.Time;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
//		SupplierDemo supplierDemo = new SupplierDemo();
//		System.out.print(supplierDemo.fetchCurrentDate());
		
		//never consume and take input , it always supplie 
		Supplier<Date> currentDate = ()-> new Date();
		System.out.println(currentDate.get());
		
	
		
	}
	
//	public Date fetchCurrentDate() {
//		return new Date();
//	}

}
