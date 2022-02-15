package javase.learning.oops.accessModifiers;

public class AccessModifierEx {
	public static void main(String[] args) {
		
		Sample obj = new Sample();
//		obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();
	}
}
