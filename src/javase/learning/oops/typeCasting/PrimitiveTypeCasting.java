package javase.learning.oops.typeCasting;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		
		short s = 100;
		int i = s; //widening
		
		System.out.println(s);
		System.out.println(i);
		
		char ch = '@';
		int i2 = ch;
		System.out.println(ch);
		System.out.println(i2);
		
		float f = 123.45f;
		double d = f;
		System.out.println(f);
		System.out.println(d);
		
		int ii = 123;
		double dd = ii;
		System.out.println(ii);
		System.out.println(dd);
		
		System.out.println("---------------------------");
		
		int i3 = 200;
		short s3 = (short) i3; //narrowing
		System.out.println(i3);
		System.out.println(s3);
		
		double d3 = 1256.23;
		float f3 = (float) d3;
		System.out.println(d3);
		System.out.println(f3);
		
		double d4 = 1535.24;
		int i4 = (int) d4;
		System.out.println(d4);
		System.out.println(i4);
	}
}
