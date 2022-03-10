package javase.learning.part3.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add("java");
		list.add(30.23);
		list.add(true);
		
		printList(list);
		
		list.addFirst(30);
		list.addLast(60);
		printList(list);
		
		list.removeFirst();
		list.removeLast();
		printList(list);
	}
	
	private static void printList(List list) {
		for (Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("----------------");
	}
}
