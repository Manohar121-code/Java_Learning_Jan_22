package javase.learning.oops.blocks;

public class StaticBlockEx {
	
	static int i;

	static {
		i = 10;
		System.out.println("Static block1 executed");
	}
	
	static {
		System.out.println("Static block2 executed");
	}
	
	public static void main(String[] args) {
		System.out.println("Main executed");
		System.out.println(i);
	}
	
}
