package javase.learning.part3.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowThrowsEx {
	public static void main(String[] args) {
		try {
			m1();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occurred - "+ e.getMessage());
		}
		
		System.out.println("-------------------");
		
		try {
			p1();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException is occurred - "+ e.getMessage());
		}
	}

	private static void m1() throws FileNotFoundException {
		m2();
	}

	private static void m2() throws FileNotFoundException {
		File f = new File("C://Database/sample.txt");
		FileReader fr = new FileReader(f);
	}
	
	private static void p1() throws NullPointerException {
		p2();
	}

	private static void p2() throws NullPointerException {
		String s = null;
		System.out.println(s.length());
	}
}
