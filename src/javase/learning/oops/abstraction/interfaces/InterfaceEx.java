package javase.learning.oops.abstraction.interfaces;

public class InterfaceEx {
	public static void main(String[] args) {
		ISample obj = new SampleImpl(); //upcasting
		obj.test();
		obj.demo();
	}
}
