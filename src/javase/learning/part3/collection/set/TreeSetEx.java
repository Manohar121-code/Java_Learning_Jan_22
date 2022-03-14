package javase.learning.part3.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
//		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		set.add(30);
		set.add(20);
		set.add(25);
		set.add(10);
		set.add(19);
		
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(40);
		set2.add(5);
		set2.add(20);
		
		set.addAll(set2);
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer i = (Integer) iterator.next();
			System.out.println(i);
		}
	}
}
