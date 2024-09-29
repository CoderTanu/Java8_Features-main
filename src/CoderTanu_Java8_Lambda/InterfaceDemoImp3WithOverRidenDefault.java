package CoderTanu_Java8_Lambda;

public class InterfaceDemoImp3WithOverRidenDefault  implements InterfaceDemo{

	@Override
	public void printNameABS() {
		System.out.println("inside InterfaceDemoImp3WithOverRidenDefault");
		
	}
	
	
	public  void printName() {
		System.out.println("welcome to my website in overriden method!");
	}
	
	public static void main(String args[]) {
		InterfaceDemoImp3WithOverRidenDefault d = new InterfaceDemoImp3WithOverRidenDefault();
		d.printName();
	}
}
