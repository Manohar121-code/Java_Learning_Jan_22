package javase.learning.basics.scanner;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("enter string value");
		String nextLine = scr.nextLine();
		System.out.println("entered string value - "+ nextLine);
		
		System.out.println("enter integer value");
		int i = scr.nextInt();
		System.out.println("i value - "+ i);
		
		System.out.println("enter string value");
		String next = scr.next();
		System.out.println("entered string value - "+ next);
		
		System.out.println("enter boolean value");
		boolean b = scr.nextBoolean();
		System.out.println("entered boolean value - "+ b);
		
		System.out.println("enter float value");
		float float1 = scr.nextFloat();
		System.out.println(float1);
		
		System.out.println("Main ended");
	}
}
