package javase.learning.basics.operators;

public class TernaryOperatorEx {
	public static void main(String[] args) {
		int age = 20;
		String s = "";
		if (age >= 18) {
			s = "He/She is eligible for vote";
		} else {
			s = "He/She is not eligible for vote";
		}
		
		System.out.println(s);
		
//		(condition) ? true : false;
		
		String s2 = (age >= 18) ? "He/She is eligible for vote" : "He/She is not eligible for vote";
		System.out.println(s2);
		
		int res = (age >= 18) ? 100 : 50;
		System.out.println(res);
	}
}
