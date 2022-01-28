package javase.learning.basics.methods;

public class MethodWithReturnTypeEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		int k = test();
		System.out.println("returned int value - "+ k);
		
		System.out.println("-----------------------");
		
		char ch = testChar();
		System.out.println("returned char value - "+ ch);
		
		System.out.println("Main ended");
	}
	
	public static int test() {
		System.out.println("test() called");
		int i = 30;
		return i;
	}
	
	public static char testChar() {
		System.out.println("testChar() called");
		char ch = 'P';
		return ch;
	}
}
