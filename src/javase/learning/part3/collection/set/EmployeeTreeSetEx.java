package javase.learning.part3.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSetEx {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		
		Employee e1 = new Employee(1, "Dinesh", 167222);
		Employee e3 = new Employee(3, "Ganesh", 687687);
		Employee e2 = new Employee(2, "Harish", 77657);
		Employee e4 = new Employee(2, "Harish", 346556);
		
		set.add(e1);
		set.add(e3);
		set.add(e2);
		set.add(e4);
		
		System.out.println(set.size());
		
		for (Employee e : set) {
			System.out.println(e);
		}
		System.out.println("--------------------");
		
		SortByEmployeeName byName = new SortByEmployeeName();
		Set<Employee> set2 = new TreeSet<>(byName);
		Employee e11 = new Employee(1, "Dinesh", 167222);
		Employee e13 = new Employee(3, "Ganesh", 687687);
		Employee e12 = new Employee(2, "Harish", 77657);
		Employee e14 = new Employee(2, "Harish", 346556);
		
		set2.add(e14);
		set2.add(e11);
		set2.add(e13);
		set2.add(e12);
		
		for (Employee e : set2) {
			System.out.println(e);
		}
		System.out.println("--------------------");
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list, byName);
		
		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println("--------------------");
	}
}
