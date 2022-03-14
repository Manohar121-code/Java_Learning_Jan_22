package javase.learning.part3.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(3);
		set.add(6);
		set.add("java");
		set.add(1);
		set.add(null);
		set.add(true);
		set.add(6);
		set.add("java");
		set.add(4);
		set.add(null);
		
		for (Object o : set) {
			System.out.println(o);
		}
		System.out.println("------------------");
		
		Set set2 = new HashSet();
		set2.add(24);
		set2.add(16);
		set2.add(4);
		
		set.addAll(set2);
		
		for (Object o : set) {
			System.out.println(o);
		}
		System.out.println("------------------");
		
		boolean contains = set.contains("java");
		System.out.println(contains);
		
		boolean remove = set.remove("java");
		System.out.println(remove);
		
		System.out.println("------------------");
		
		for (Object o : set) {
			System.out.println(o);
		}
		System.out.println("------------------");
	}
}
