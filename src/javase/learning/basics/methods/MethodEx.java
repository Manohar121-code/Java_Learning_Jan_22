package javase.learning.basics.methods;

public class MethodEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		test();
		test();
		
		System.out.println("Main ended");
	}
	
//	Syntax
//	<access_modifier> <static/non-static> <return-type> methodName() {
//		
//	}
	
	public static void test() {
		System.out.println("test() started");
		
		for(int i = 1; i <= 3; i++) {
			System.out.println(i);
		}
		
		System.out.println("test() ended");
	}
}
