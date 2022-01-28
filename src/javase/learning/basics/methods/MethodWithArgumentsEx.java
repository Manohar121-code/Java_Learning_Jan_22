package javase.learning.basics.methods;

public class MethodWithArgumentsEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		int sum1 = sum();
		System.out.println("sum value - "+ sum1);
		
		System.out.println("sum value - "+ sum());
		System.out.println("sum value - "+ sum());
		
		System.out.println("-------------------");
		
		int sum = sumForTwoNumbers(10, 40);
		System.out.println("sum value - "+ sum);
		
		System.out.println("-------------------");
		
		sumOfTwo(25, 35);
		
		System.out.println("Main ended");
	}
	
	public static int sum() {
		int i = 10;
		int j = 20;
		int sum = i+j;
		return sum;
	}
	
	public static int sumForTwoNumbers(int i, int j) {
		int sum = i+j;
		return sum;
	}
	
	public static void sumOfTwo(int i, int j) {
		int sum = i+j;
		System.out.println("sum value - "+ sum);
	}
}
