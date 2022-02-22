package javase.learning.oops.typeCasting.privateFinalStatic;

public class DriverClassEx {
	public static void main(String[] args) {
		Parent obj = new Child();
//		obj.privateMethod();
		obj.finalMethod();
		obj.staticMethod();
		
		Parent.staticMethod();
		
		Parent obj2 = null;
//		obj2.finalMethod();
		obj2.staticMethod();
	}
}
