package javase.learning.oops.abstraction.interfaces;

public class SampleImpl implements ISample {

	@Override
	public void test() {
		System.out.println("SampleImpl test() called");
	}

	@Override
	public void demo() {
		System.out.println("SampleImpl demo() called");
	}

}
