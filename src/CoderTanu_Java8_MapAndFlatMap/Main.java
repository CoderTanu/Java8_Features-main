package CoderTanu_Java8_MapAndFlatMap;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Main {

	public static void main(String[] args) throws DatatypeConfigurationException {
		
		List<String> citiesWorkedE1 = new ArrayList<>();
		citiesWorkedE1.add("Bhubanesware");
		citiesWorkedE1.add("kolkata");
		citiesWorkedE1.add("Banglore");
		citiesWorkedE1.add("noida");
		citiesWorkedE1.add("pune");
		
		Employee e1 = new Employee(1,"tanu",citiesWorkedE1 );
		
		List<String> citiesWorkedE2 = new ArrayList<>();
		citiesWorkedE2.add("Bhubanesware");
		citiesWorkedE2.add("kolkata");
		citiesWorkedE2.add("pune");
		
		Employee e2 = new Employee(2,"wani",citiesWorkedE2);
		
		
		List<String> citiesWorkedE3 = new ArrayList<>();
		citiesWorkedE3.add("Banglore");
		citiesWorkedE3.add("noida");
		citiesWorkedE3.add("pune");
		
		Employee e3 = new Employee(3,"gunpreet",citiesWorkedE3);
		
		List<Employee> newEmp= new ArrayList<Employee>();
		newEmp.add(e1);
		newEmp.add(e2);
		newEmp.add(e3);
		
		System.out.println(newEmp.toString());
		
		List<Integer> ids = newEmp.stream().map(emp-> emp.getId()).collect(Collectors.toList());
		System.out.println(ids);
		
		 GregorianCalendar cal =new GregorianCalendar();
		 cal.setTime(new Date());
		 XMLGregorianCalendar xCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
//		Date date = xCal.toGregorianCalendar;
//		System.out.println(date);
		
		 
		 
	}

}
