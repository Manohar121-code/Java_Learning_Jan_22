package javase.learning.basics.incDec;

public class IncDecEx {
	public static void main(String[] args) {
		int i = 10;
		i = i+1;
		System.out.println(i);
		
		int k = 10;
		k++;
		System.out.println("k value - "+k); //k = 11
		
		++k;
		System.out.println("k value - "+k); //k = 12
		
		int j = 15;
		int s = j++;
		
		System.out.println("s value - "+s);
		System.out.println("j value - "+j);
		
		int m = 20;
		int w = ++m;
		
		System.out.println("w value - "+w);
		System.out.println("m value - "+m);
		
		int r = 15;
		if(r++ == 16) {
			System.out.println("if condition executed");
		}
		//r = 16
		System.out.println(r++);//r = 17
		System.out.println(r); // r = 17
		
		System.out.println(++r);// r = 18
		
		System.out.println("------------------------------");
		
		int h = 10;
		System.out.println(h--);//h = 9
		System.out.println(h);
		
		System.out.println(--h);//h = 8
	}
}
