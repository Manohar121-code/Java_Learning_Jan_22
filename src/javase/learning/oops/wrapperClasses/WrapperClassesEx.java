package javase.learning.oops.wrapperClasses;

public class WrapperClassesEx {
	public static void main(String[] args) {
		int i = 10; //primitive
		Integer iObj = new Integer(i); //auto - boxing
		
		System.out.println(i);
		System.out.println(iObj);
		
		int i2 = iObj.intValue(); //unboxing
		System.out.println(i2);
		
		System.out.println("--------------------------");
		
		char ch = '@';
		Character cObj = new Character(ch); //boxing
		char ch2 = cObj.charValue(); //unboxing
		
		System.out.println(ch);
		System.out.println(cObj);
		System.out.println(ch2);
		
		System.out.println("--------------------------");
		
		boolean b = true;
		Boolean bObj = new Boolean(b); //boxing
		boolean b2 = bObj.booleanValue(); //unboxing
		
		System.out.println(b);
		System.out.println(bObj);
		System.out.println(b2);
	}
}
