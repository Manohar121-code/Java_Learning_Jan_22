package javase.learning.oops.abstraction.interfaces.multipleInheritance;

public class DriverClass {
	public static void main(String[] args) {
		ISample1 obj1 = new SampleImpl();
		obj1.test();
		obj1.m1();
		
		ISample2 obj2 = new SampleImpl();
		obj2.test();
		obj2.m2();
	}
}
