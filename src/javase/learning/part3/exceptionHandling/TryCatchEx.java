package javase.learning.part3.exceptionHandling;

public class TryCatchEx {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int i= 10;
		int j = 2;
		
		try {
			int div = i/j;
			System.out.println("division value - "+ div);
			
			String s = "java";
			System.out.println("length is - "+ s.length());
			
			int[] arr = {1,2,3};
			System.out.println("7th index element in array - "+ arr[7]);
			
		} catch (NullPointerException e) {
			System.out.println("NullPointer exception occurred - "+ e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurred - "+ e.getMessage());
		} catch (Exception e) {
			System.out.println("Generic exception occurred - "+ e.getMessage());
		}
		
		System.out.println("Main ended");
	}
}
