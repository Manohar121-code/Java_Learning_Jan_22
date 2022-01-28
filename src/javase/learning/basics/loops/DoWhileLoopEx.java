package javase.learning.basics.loops;

public class DoWhileLoopEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		//Syntax
//		dec/init
//		do {
//			
//			inc/dec
//		} while(condition);
		
		int i = 15;
		do {
			System.out.println("Do-While loop is executed");
			i++;
		} while(i >= 20);
		
		int j = 15;
		do {
			System.out.println("Hello World!!!");
			j++;
		} while(j <= 20);
		
		System.out.println("Main ended");
	}
}
