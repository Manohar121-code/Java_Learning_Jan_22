package javase.learning.oops.abstraction.interfaces.multipleInheritance;

public class SampleImpl implements ISample1, ISample2 {

	@Override
	public void m2() {
		System.out.println("SampleImpl m2() called");
	}

	@Override
	public void test() {
		System.out.println("SampleImpl test() called");
	}

	@Override
	public void m1() {
		System.out.println("SampleImpl m1() called");
	}

}
