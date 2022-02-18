package javase.learning.oops.typeCasting;

public class ClassCastingEx {
	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();

		Child c = new Child();

		Parent obj = new Child();// upcasting
		obj.m1();

		System.out.println("----------------------");

//		Child obj2 = new Parent();
//		obj2.m2();

		Parent obj3 = new Child();// upcasting

		Child c2 = (Child) obj3;// downcasting
		c2.m1();
		c2.m2();

		Parent obj4 = new Child();//upcasting
		if (obj4 instanceof Child) {
			System.out.println("obj4 is instance of Child");
			Child c3 = (Child) obj4;//downcasting
		}
	}
}
