package javase.learning.oops.polymorphism.methodOverLoading;

public class MethodOverLoadingEx {
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.test();
		obj.test(10);
		obj.test("Naresh");
		obj.test(10, 20);
		obj.test(10, "Naresh");
		obj.test("Naresh", 10);
		obj.test("Naresh", "Suresh");
	}
}
