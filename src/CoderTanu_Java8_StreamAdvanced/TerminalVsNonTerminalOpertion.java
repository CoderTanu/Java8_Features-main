package CoderTanu_Java8_StreamAdvanced;

import java.util.Arrays;
import java.util.List;

public class TerminalVsNonTerminalOpertion {
	
	
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "tanu");
		Employee e2 = new Employee(2, "code");
		Employee e3 = new Employee(3, "code2");
		Employee e4 = new Employee(4, "coder");
		
		List<Employee> empList =Arrays.asList(e1,e2,e3,e4);
		
		List<Integer> intList =Arrays.asList(1,2,3,4,5);
		
		intList.stream().filter(a-> a%2 == 0).map(a-> a+a).filter(a->a>5).forEach(x->System.out.println(x));
		
		empList.stream().filter(e -> e.getId() %2 ==0).map(e->{
			e.printName();
			return e.getName();
		}).forEach(e ->System.out.println(" al last "+e));
		
		System.out.println(intList.stream().reduce((a,b)-> a+b).get());
		

	}

}

class Employee{
	private int id;
	private String name;
	
	public Employee(int id , String name) {
		super();
		this.id=id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public void printName() {
		System.out.println("en emp class " + name);
	}
}

