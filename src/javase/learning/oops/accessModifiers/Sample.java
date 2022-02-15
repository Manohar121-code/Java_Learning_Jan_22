package javase.learning.oops.accessModifiers;

public class Sample {

	//private - access with in the class
	//default - access with in the package
	//protected - access with in the package, outside of package we need to extend the class
	//public - anywhere in the project
	
	private void privateMethod() {
		System.out.println("private access method called");
	}
	
	void defaultMethod() {
		System.out.println("default access method called");
	}
	
	protected void protectedMethod() {
		System.out.println("protected access method called");
	}
	
	public void publicMethod() {
		System.out.println("public access method called");
	}
	
}
