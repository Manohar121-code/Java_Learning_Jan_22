package javase.learning.part3.collection.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Mahesh", 123456);
		Employee e2 = new Employee(1, "Mahesh", 654321);
//		Employee e3 = e2;
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
//		set.add(e3);
		System.out.println(set.size());
	}
}
