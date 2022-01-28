package javase.learning.basics.operators;

public class LogicalOperatorsEx {
	public static void main(String[] args) {
//		if (condition) {
//
//		}
//
//		if ((condition1 || condition2)) {
//
//		}
//
//		if ((condition1 && condition2)) {
//
//		}
		
		int i = 10;
		int j = 20;
		
		if(i >= j || i == j || i <= j) {
			System.out.println("if executed ->  i >= j || i == j || i <= j");
		}
		
		if(i >= j || i == j) {
			System.out.println("if executed ->  i >= j || i == j");
		}
		
		if(i >= j && i == j && i <= j) {
			System.out.println("if executed ->  i >= j && i == j && i <= j");
		}
		
		if(i <= j && i != j && i < j) {
			System.out.println("if executed ->  i <= j && i != j && i < j");
		}
		
		if(i >= 8 || (j >= 18 && i < j)) {
			System.out.println("if executed ->  i >= 8 || (j >= 18 && i < j)");
		}
	}
}
