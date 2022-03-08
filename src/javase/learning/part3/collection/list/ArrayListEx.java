package javase.learning.part3.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
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
	}
}
