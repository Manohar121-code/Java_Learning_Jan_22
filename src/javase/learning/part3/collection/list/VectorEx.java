package javase.learning.part3.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List list = new Vector();
		list.add(10);
		list.add("Python");
		list.add('T');
		list.add(true);
		list.add(null);
		list.add(10.34);
		list.add(null);
		
		int size = list.size();
		System.out.println(size);
		
		Object obj = list.get(2);
		System.out.println(obj);
		
		System.out.println("----------------");
		
		//for
		for(int i = 0; i < list.size(); i++) {
			Object object = list.get(i);
			System.out.println(object);
		}
		
		System.out.println("----------------");
		
		//foreach
		for (Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("----------------");
		
		//iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
		}
		
		System.out.println("----------------");
		
		list.add(1, "Java");
		printList(list);
		
		List list2 = new ArrayList();
		list2.add(10);
		list2.add(false);
		list2.add(87.56);
		
		list.addAll(list2);
		printList(list);
		
		//clear all elements from collection
//		list.clear();
//		System.out.println(list.size());
		
		boolean contains = list.contains("Python");
		System.out.println(contains);
		
		int indexOf = list.indexOf('T');
		System.out.println(indexOf);
		
		int lastIndexOf = list.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
//		list.clear();
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		System.out.println("---------------");

		list.add(7, 3);
		printList(list);
		
		Object remove = list.remove(2);
		printList(list);
		
		list.remove(87.56);
		printList(list);
		
		Integer iObj = new Integer(3);
		list.remove(iObj);
		printList(list);
		
		list.set(4, "golang");
		printList(list);
		
		List subList = list.subList(2, 5);
		printList(subList);
	}
	
	private static void printList(List list) {
		for (Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("----------------");
	}
}
