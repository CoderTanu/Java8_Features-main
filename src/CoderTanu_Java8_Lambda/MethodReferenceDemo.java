package CoderTanu_Java8_Lambda;

public class MethodReferenceDemo {
	
	

	public static void main(String[] args) {
		
		/*by using lambda expression
		 * FuntionalInterfaceDemo f =
		 * ()->System.out.println("your are in method refernce"); f.singleAbsMethod();
		 */
		
		//method reference
		FuntionalInterfaceDemo f= Test ::testImplementation;
		f.singleAbsMethod();

	}
	
	
	

}

  class  Test{
	public static void testImplementation() {
	System.out.println("you are in implementation class ");
}
  }
