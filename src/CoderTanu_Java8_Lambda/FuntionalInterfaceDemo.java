package CoderTanu_Java8_Lambda;


@FunctionalInterface
public interface FuntionalInterfaceDemo {
	
	void singleAbsMethod();
	
	static void printName() {
		System.out.println("hi tanu");
	}
	
	 default void printName2() {
		System.out.println("hi tanu");
	}

}
