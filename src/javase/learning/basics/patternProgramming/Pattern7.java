package javase.learning.basics.patternProgramming;

//12345
//678910
//1112131415
//1617181920
//2122232425

public class Pattern7 {
	public static void main(String[] args) {
		
		int h = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((h++) +" ");
			}
			System.out.println();
		}
	}
}
