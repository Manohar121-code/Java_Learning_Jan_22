package javase.learning.part3.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add("Java");
		set.add(34.87);
		set.add(true);
		set.add(34.87);
		set.add(10);
		set.add(null);
		set.add('@');
		set.add(null);
		
		for (Object o : set) {
			System.out.println(o);
		}
		System.out.println("------------------");
		
		Set set2 = new HashSet();
		set2.add(30);
		set2.add("Java");
		set2.add(false);
		System.out.println(set2);
		
		set.addAll(set2);
		for (Object o : set) {
			System.out.println(o);
		}
		System.out.println("------------------");
	}
}
