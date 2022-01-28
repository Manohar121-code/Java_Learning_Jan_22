package javase.learning.basics.loops;

public class BreakEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			if(i == 3) {
				break;
			}
		}
		
		System.out.println("Main ended");
	}
}
