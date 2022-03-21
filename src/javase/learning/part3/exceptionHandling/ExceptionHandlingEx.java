package javase.learning.part3.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("enter first digit");
		int i = scr.nextInt();
		
		System.out.println("enter second digit");
		int j = scr.nextInt();
		
		if (j != 0) {
			int div = i/j;
			System.out.println(div);
		} else {
			System.out.println("Can not divide by zero");
		}
		
		String s = null;
		if (s != null) {
			int length = s.length();
			System.out.println("length - "+ length);
		}
		
		int[] arr = {1,2,3,4,5};
		int index = 7;
		if (index < arr.length) {
			int k = arr[index];
			System.out.println(k);
		}
		
		String s2 = "java";
		int index2 = 2;
		if (index2 < s2.length()) {
			char charAt = s2.charAt(index2);
			System.out.println(charAt);
		}
	}
}
