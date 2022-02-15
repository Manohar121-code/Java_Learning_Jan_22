package javase.learning.oops.polymorphism.methodOverRiding;

public class MethodOverridingEx {
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		obj.m1();
		obj.m2();
		
		System.out.println("------------------");
		
		Child ch = new Child();
		ch.m1();
		ch.m2();
		
	}
}
