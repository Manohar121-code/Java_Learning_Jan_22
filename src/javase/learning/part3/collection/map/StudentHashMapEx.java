package javase.learning.part3.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentHashMapEx {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<Student, String>();
		Student s1 = new Student(1, "Suresh", 78);
		Student s2 = new Student(2, "Naresh", 68);
		Student s4 = new Student(3, "Mahesh", 89);
		
		map.put(s1, "Bangalore");
		map.put(s2, "Hyderabad");
		map.put(s4, "Tirupati");
		
		System.out.println(map.size());
		
		Set<Student> keySet = map.keySet();
		for (Student s : keySet) {
			System.out.println(s+" -> "+ map.get(s));
		}
		System.out.println("--------------------------");
		
		Student s3 = new Student(1, "Suresh", 78);
		
		map.put(s3, "Tirupati");
		
		System.out.println(map.size());
		
		Set<Student> keySet2 = map.keySet();
		for (Student s : keySet2) {
			System.out.println(s+" -> "+ map.get(s));
		}
		System.out.println("--------------------------");
		
		Set<Entry<Student,String>> entrySet = map.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			System.out.println(entry.getKey()+" -> "+ entry.getValue());
		}
		
		System.out.println("--------------------------");
		
		Collection<String> values = map.values();
		for (String val : values) {
			System.out.println(val);
		}
		System.out.println("--------------------------");
	}
}
