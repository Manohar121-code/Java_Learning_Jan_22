package javase.learning.oops.garbageCollection;

public class GarbageCollectionEx {
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj = null;
		
		
		Sample obj2 = new Sample();
		Sample obj3 = new Sample();
		obj2 = obj3;
		
		
		Sample obj4 = new Sample();
		Sample obj5 = obj4;
		obj4 = new Sample();
		
		System.gc();
		Runtime.getRuntime().gc();
	}
}
