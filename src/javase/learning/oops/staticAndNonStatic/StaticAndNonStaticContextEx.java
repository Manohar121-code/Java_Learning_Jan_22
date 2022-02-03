package javase.learning.oops.staticAndNonStatic;

public class StaticAndNonStaticContextEx {
	
	public static String country = "India";
	
	public static void main(String[] args) {
		staticMethod1();
		staticMethod2();
		System.out.println(country);
	}
	
	public static void staticMethod1() {
		staticMethod2();
		System.out.println(country);
	}
	
	public static void staticMethod2() {
		System.out.println(country);
//		nonStaticMethod1();
	}
	
	public void nonStaticMethod1() {
		nonStaticMethod2();
		staticMethod1();
		staticMethod2();
		System.out.println(country);
	}
	
	public void nonStaticMethod2() {
		nonStaticMethod1();
		staticMethod1();
		staticMethod2();
		System.out.println(country);
	}
}
