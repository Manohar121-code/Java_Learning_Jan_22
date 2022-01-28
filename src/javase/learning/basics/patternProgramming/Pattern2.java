package javase.learning.basics.patternProgramming;

//5 4 3 2 1
//5 4 3 2 1
//5 4 3 2 1
//5 4 3 2 1
//5 4 3 2 1

public class Pattern2 {
	public static void main(String[] args) {
		
		for(int h = 1; h <= 5; h++) {
			for(int i = 5; i >= 1; i--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
