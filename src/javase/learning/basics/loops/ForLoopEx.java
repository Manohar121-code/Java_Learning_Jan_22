package javase.learning.basics.loops;

public class ForLoopEx {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
//		Syntax
//		for(dec/init; condition; inc/dec) {
//			
//		}
		
		for(int i = 13; i <= 17; i++) {
			System.out.println("Hello World!!!");
		}
		
		for(int j = 20; j >= 10; j--) {
			System.out.println("second for loop");
		}
		
		for(char k = 'a'; k <= 'z'; k++) {
//			int m = k;
			System.out.println(k);
		}
		
		System.out.println("Main ended");
		
	}
}
