package javase.learning.part3.string;

public class StringEx {
	public static void main(String[] args) {
		int i = 10;
		String s1 = "Hello World"; //Constant pool area
		
		String s2 = new String("Hello World"); //Non-Constant pool area
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "Hello World";
		System.out.println(s1 == s3);
		
		String s4 = new String("Hello World");
		System.out.println(s2 == s4);
		
		String s5 = s4.intern();
		System.out.println(s3 == s5);
		
		String s6 = new String(s3);
		
		System.out.println("------------------------");
		
		String t1 = "Java";
		String t2 = t1.concat(" is a programming language");
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println("----------------------");
		
		StringBuilder t3 = new StringBuilder("Java");
		StringBuilder t4 = t3.append(" is a programming language");
		System.out.println(t3);
		System.out.println(t4);
	}
}
