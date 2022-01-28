package javase.learning.basics.loops;

public class WhileLoopEx {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		//Syntax
		//dec/init
//		while(condition) {
//			
//			inc/dec
//		}
		
		int i = 1;
		while(i <= 5) {
			System.out.println("Hello World!!!");
			i++;
		}
		
		int j = 5;
		while(j >= 1) {
			System.out.println("While loop executed");
			--j;
		}
		
		System.out.println("Main ended");
		
	}
}
