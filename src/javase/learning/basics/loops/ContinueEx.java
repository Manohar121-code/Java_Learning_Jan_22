package javase.learning.basics.loops;

public class ContinueEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i+" iteration started");
			
			if(i == 4) {
				continue;
			}
			
			System.out.println(i+" iteration ended");
		}
		
		System.out.println("Main ended");
	}
}
