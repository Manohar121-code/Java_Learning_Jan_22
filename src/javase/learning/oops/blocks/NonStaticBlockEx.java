package javase.learning.oops.blocks;

public class NonStaticBlockEx {
	
	int i;
	
	{
		i = 20;
		System.out.println("Non-static block1 executed");
	}
	
	{
		System.out.println("Non-static block2 executed");
	}

	public static void main(String[] args) {
		System.out.println("Main started");
		
		NonStaticBlockEx obj = new NonStaticBlockEx();
		System.out.println(obj.i);
		
		System.out.println("-----------------------");
		
		NonStaticBlockEx obj2 = new NonStaticBlockEx();
		
		System.out.println("Main ended");
	}
	
}
