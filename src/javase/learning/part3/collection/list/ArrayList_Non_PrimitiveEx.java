package javase.learning.part3.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Non_PrimitiveEx {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1, "Mahesh", 25);
		Employee e2 = new Employee(2, "Arjun", 24);
		Employee e3 = new Employee(3, "Sathish", 32);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		printList(list);
		
		Employee e4 = new Employee(4, "Ramesh", 34, 1234.56);
		list.add(1, e4);
		printList(list);
		
	}
	
	private static void printList(List<Employee> list) {
		for (Employee e : list) {
			System.out.println(e);
		}
		
		System.out.println("----------------");
	}
}
