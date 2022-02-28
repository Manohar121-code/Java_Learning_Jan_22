package javase.learning.oops.encapsulation;

public class SingletonEx {
	public static void main(String[] args) {
		
		Sample obj = Sample.getInstance();
		Sample obj2 = Sample.getInstance();
		
		System.out.println(obj);
		System.out.println(obj2);
		
		System.out.println(Sample.getInstance());
		System.out.println(Sample.getInstance());
	}
}
