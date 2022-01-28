package javase.learning.basics.conditionalStatements;

public class SwitchEx {
	public static void main(String[] args) {
		
		int i = 20;
		
		switch (i) {
		case 10:
			System.out.println("given value is 10");
			break;
		case 20:
			System.out.println("given value is 20");
			break;
		case 30:
			System.out.println("given value is 30");
			break;
		case 40:
			System.out.println("given value is 40");
			break;
		default:
			System.out.println("provided value - "+ i);
			break;
		}
		
	}
}
