package javase.learning.oops.accessModifiersTest;

import javase.learning.oops.accessModifiers.Sample;

public class AccessModifiersTest extends Sample {
	
	public void test() {
		protectedMethod();
	}
	
	public static void main(String[] args) {
		Sample obj = new Sample();
//		obj.defaultMethod();
		obj.publicMethod();
		
		AccessModifiersTest obj2 = new AccessModifiersTest();
		obj2.test();
	}
}
