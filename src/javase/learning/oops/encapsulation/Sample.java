package javase.learning.oops.encapsulation;

public class Sample {
	
//	private static Sample obj = new Sample();//EAGER
	private static Sample obj;//LAZY

	private Sample() {
		
	}
	
	public static Sample getInstance() {
		if (obj == null) {//LAZY
			obj = new Sample();
		}
		return obj;
	}
	
}
