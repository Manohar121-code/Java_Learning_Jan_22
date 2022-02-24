package javase.learning.oops.abstraction.abstractClass;

public class AbstractClassEx {
	public static void main(String[] args) {
		
		Sample obj = new SampleChild2(); //upcasting
		check(obj);
	}
	
	public static void check(Sample obj) {
		obj.test();
		obj.m2();
	}
}
