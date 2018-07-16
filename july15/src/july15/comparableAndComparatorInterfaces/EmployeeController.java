package july15.comparableAndComparatorInterfaces;

import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeController {
	public static void main(String a[]){
		Employee e1 = new Employee(122, "Shubham");
		Employee e2 = new Employee(122,"Ritesh");	
		int result = e1.compareTo(e2);
		System.out.println(result);
		System.out.println("AAA".compareTo("D"));
		
		//tree set will provide default natulral sorting using the comparable of employee class
		SortedSet<Employee> s1 = new TreeSet<Employee>();
		s1.add(e1);
		s1.add(e2);
		System.out.println(s1);
		
		//tree set will provide customized sorting using the comparator from EmployeeCustomComparotor
		SortedSet<Employee> s2 = new TreeSet<Employee>(new EmployeeCustomComparotor());
		s2.add(e1);
		s2.add(e2);
		System.out.println(s2);
		
	}
	

}
