package CoderTanu_Java8_Lambda;

public class DiamondProblemClass implements DiamondProblemInterface1 , DiamondProblemInterface2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DiamondProblemInterface2.super.m1();
	}
	
	public static void main(String args[]) {
		DiamondProblemClass d = new DiamondProblemClass();
		d.m1();
	}

}
