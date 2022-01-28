package javase.learning.basics.conditionalStatements;

public class IfElseIfElseEx {
	public static void main(String[] args) {
		int rank = 50000;
		
		if(rank < 2000) {
			System.out.println("He/She will get seat in Vidyaniketan");
		} else if(rank < 7000) {
			System.out.println("He/She will get seat in SVCE");
		} else if(rank < 15000) {
			System.out.println("He/She will get seat in Siddharth");
		} else if(rank < 30000) {
			System.out.println("He/She will get seat in MITS");
		} else {
			System.out.println("He/She will get seat in any college");
		}
	}
}
