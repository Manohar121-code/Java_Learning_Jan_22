package javase.learning.part3.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeLinkedHashSetEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Mahesh", 123456);
		Employee e2 = new Employee(1, "Mahesh", 654321);
		Employee e3 = new Employee(2, "Arjun", 868676);
		Employee e4 = new Employee(3, "Satheesh", 868676);
		
		Set<Employee> set = new LinkedHashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println(set.size());
		
		for (Employee e : set) {
			System.out.println(e);
		}
	}
}
