package javase.learning.oops.typeCasting.privateFinalStatic;

public class Parent {

	private void privateMethod() {
		System.out.println("Parent privateMethod() called");
	}
	
	public final void finalMethod() {
		System.out.println("Parent finalMethod() called");
	}
	
	public static void staticMethod() {
		System.out.println("Parent staticMethod() called");
	}
	
}
