package javase.learning.part3.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Sachin");
		map.put(45, "Rohit");
		map.put(7, "Dhoni");
		map.put(18, "Kohli");
		
		String value = map.get(45);
		System.out.println(value);
		
		int size = map.size();
		System.out.println(size);
		
		System.out.println(map);
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			String val = map.get(key);
			System.out.println(key+" -> "+val);
		}
		
		System.out.println("--------------------------");
		
		map.put(7, "Mahendra Singh Dhoni");
		System.out.println(map.size());
		
		Set<Integer> keySet2 = map.keySet();
		for (Integer key : keySet2) {
			String val = map.get(key);
			System.out.println(key+" -> "+val);
		}
		
		System.out.println("--------------------------");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" -> "+ val);
		}
		
		System.out.println("--------------------------");
		
		boolean containsKey = map.containsKey(20);
		System.out.println(containsKey);
		boolean containsKey2 = map.containsKey(45);
		System.out.println(containsKey2);
		
		boolean containsValue = map.containsValue("Rohit Sharma");
		System.out.println(containsValue);
		boolean containsValue2 = map.containsValue("Rohit");
		System.out.println(containsValue2);
		
		String orDefault = map.getOrDefault(17, "default Value");
		System.out.println(orDefault);
		
//		map.clear();
		
		boolean empty = map.isEmpty();
		System.out.println(empty);
		
		String remove = map.remove(18);
		System.out.println(remove);
		
		Set<Entry<Integer, String>> entrySet2 = map.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" -> "+ val);
		}
		
		System.out.println("--------------------------");
		
		Collection<String> values = map.values();
		for (String s : values) {
			System.out.println(s);
		}
		
	}
}
